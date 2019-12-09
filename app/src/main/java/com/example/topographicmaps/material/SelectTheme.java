package com.example.topographicmaps.material;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.topographicmaps.R;

public class SelectTheme extends AppCompatActivity {

    protected ListView list;
    String numberTheme = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_theme);
        list = findViewById(R.id.listOfThemes);
       // registerForContextMenu(list);



// определяем строковый массив
        final String[] themeNames = new String[] {
                "Тема 5 Занятие №1\nТопографические карты и их чтение.",
                "Тема 5 Занятие №2\nПодготовка карты к работе, измерения по карте.",
                "Тема 5 Занятие №3\nОсновные правила ведения рабочей карты.",
                "Тема 5 Занятие №4\nАнализ и оценка местности командиром.",
                "Тема 5 Занятие №5\nИзмерения и ориентирование командира на местности без карты и по карте.",
                "Тема 5 Занятие №6\nОсновные правила составления боевых графических документов" +
                        " командиром."

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, themeNames);

        list.setAdapter(adapter);


        onButton();
    }



    protected void onButton(){

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + parent.getAdapter().getItem(position),
                        Toast.LENGTH_LONG).show();
                if (position == 0){

                    numberTheme = "0";
                    goToActive(SelectFile.class);
                }
                else if (position == 1){
                    numberTheme = "1";
                    goToActive(SelectFile.class);
                }
                else if (position == 2){
                    numberTheme = "2";
                    goToActive(SelectFile.class);
                }
                else if (position == 3){
                    numberTheme = "3";
                    goToActive(SelectFile.class);
                }
                else if (position == 4){
                    numberTheme = "4";
                    goToActive(SelectFile.class);
                }
                else if (position == 5){
                    numberTheme = "5";
                    goToActive(SelectFile.class);
                }

            }
        });
    }
    protected void goToActive(Class activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("numberTheme", numberTheme);
        startActivity(intent);
    }


}
