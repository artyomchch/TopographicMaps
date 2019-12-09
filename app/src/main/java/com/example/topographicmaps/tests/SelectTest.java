package com.example.topographicmaps.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.topographicmaps.R;
import com.example.topographicmaps.openFile.OpenFile;

public class SelectTest extends AppCompatActivity  {

    String  typeTest = "";

    public String getTypeTest() {
        return typeTest;
    }

    protected ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_test);

        // элементы списка которые будут в него внесены
        final String[] themeNames = new String[] {
                "Тема 5 Занятие №1\nТопографические карты и их чтение.",
                "Тема 5 Занятие №2\nПодготовка карты к работе, измерения по карте.",
                "Тема 5 Занятие №3\nОсновные правила ведения рабочей карты.",
                "Тема 5 Занятие №4\nАнализ и оценка местности командиром.",
                "Тема 5 Занятие №5\nИзмерения и ориентирование командира на местности без карты и по карте.",
                "Тема 5 Занятие №6\nОсновные правила составления боевых графических документов" +
                        " командиром."
        };

        // Связываемся с ListView
        list =  findViewById(R.id.listOfTests);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, themeNames);

        // устанавливаем адаптер списку
        list.setAdapter(adapter);

        onButton();


    }

    protected void onButton(){

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + parent.getAdapter().getItem(position),
                        Toast.LENGTH_LONG).show();
                if (position == 0){
                   typeTest = "test1.pdf";
                   goToActive(OpenFile.class);
                }
                else if (position == 1){
                    typeTest = "test2.pdf";
                    goToActive(OpenFile.class);
                }
                else if (position == 2){
                    typeTest = "test3.pdf";
                    goToActive(OpenFile.class);
                }
                else if (position == 3){
                    typeTest = "test4.pdf";
                    goToActive(OpenFile.class);
                }
                else if (position == 4){
                    typeTest = "test5.pdf";
                    goToActive(OpenFile.class);
                }
                else if (position == 5){
                    typeTest = "test6.pdf";
                    goToActive(OpenFile.class);
                }

            }
        });

    }


    protected void goToActive(Class activity){
        Intent intent = new Intent(this, activity);
        intent.putExtra("name", typeTest);
        startActivity(intent);
    }


}
