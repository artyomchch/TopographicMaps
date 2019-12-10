package com.example.topographicmaps.soldier_officer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.topographicmaps.R;
import com.example.topographicmaps.Strings;
import com.example.topographicmaps.material.SelectTheme;
import com.example.topographicmaps.tests.SelectTest;

import org.w3c.dom.Text;

public class SoldierOfficer extends AppCompatActivity {
    ImageView image;
    String soldierOfficer;
    TextView sold;
    TextView main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soldier_officer);

        image = findViewById(R.id.imageViewSoldat);
        sold = findViewById(R.id.soldierOff);
        main = findViewById(R.id.main);

        soldierOfficer = getIntent().getStringExtra("officer");  // получение данных об офицере или нет

        Strings str = new Strings();
        if (soldierOfficer.equals("0")){    // soldier = 0 , officer = 1
            sold.setText(str.getValuesForSoldier());
            main.setText("Для студентов, обучающихся по программе подготовки солдат запаса");
            image.setImageResource(R.drawable.soldier);
        }
        else {
            sold.setText(str.getValuesForOfficer());

        }



        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Button btnAlpha =findViewById(R.id.tests);
        btnAlpha.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.startAnimation(animAlpha);
                goToActive(SelectTest.class);
            }
        });

        final Animation animBeta = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Button btnBeta =findViewById(R.id.material);
        btnBeta.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.startAnimation(animBeta);
                goToActive(SelectTheme.class);
            }
        });
    }
    protected void goToActive(Class activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("officer", soldierOfficer);
        startActivity(intent);
    }
}
