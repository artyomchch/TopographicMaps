package com.example.topographicmaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.topographicmaps.material.SelectTheme;
import com.example.topographicmaps.tests.SelectTest;

public class MainActivity extends AppCompatActivity {

    LinearLayout main;
    TextView test;
    TextView bold2;
    TextView bold1;
    TextView test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main_layout);
        test = findViewById(R.id.review1);
        bold1 = findViewById(R.id.bold1);
        bold2 = findViewById(R.id.bold2);
        test2 = findViewById(R.id.test2);


        Strings str = new Strings();
        test.setText(str.values1);
        bold1.setText(str.bold1);
        bold2.setText(str.bold2);
        test2.setText(str.values2);

        Drawable myImg = ContextCompat.getDrawable(getApplicationContext(), R.drawable.miltary);
        if (myImg != null) {
            myImg.setAlpha(64);
        }
        main.setBackground(myImg);



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
        startActivity(intent);
    }


}
