package com.example.topographicmaps.material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.topographicmaps.R;

public class SelectTheme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_theme);
        ListView listView = findViewById(R.id.listOfThemes);



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

        listView.setAdapter(adapter);
    }
}
