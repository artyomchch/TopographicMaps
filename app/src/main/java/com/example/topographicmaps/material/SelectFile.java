package com.example.topographicmaps.material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.topographicmaps.R;

public class SelectFile extends AppCompatActivity {
    String theme;
    String numberFile = "";
    protected ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_file);

        listView = findViewById(R.id.listFile);

        final String[] themeNames = new String[] {
                "1) Презентация",
                "2) Учебный материал",
                "3) Контрольные вопросы"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, themeNames);

        listView.setAdapter(adapter);
        theme = getIntent().getStringExtra("numberTheme");

        onButton();




    }

    protected void onButton(){

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + parent.getAdapter().getItem(position),
                        Toast.LENGTH_LONG).show();
                if (position == 0){

                    numberFile = "0";
                    goToActive(OpenAllFiles.class);
                }
                else if (position == 1){
                    numberFile = "1";
                    goToActive(OpenAllFiles.class);
                }
                else if (position == 2){
                    numberFile = "2";
                    goToActive(OpenAllFiles.class);
                }


            }
        });
    }
    protected void goToActive(Class activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("numberFile", numberFile);
        intent.putExtra("numberTheme", theme);
        startActivity(intent);
    }


}
