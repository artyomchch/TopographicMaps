package com.example.topographicmaps.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.topographicmaps.R;

public class SelectTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_test);

        // элементы списка которые будут в него внесены
        String[] colors = { "Красный", "Оранжевый", "Желтый", "Зелёный", "Голубой", "Синий", "Фиолетовый"};

        // Связываемся с ListView
        ListView list =  findViewById(R.id.listOfTests);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, colors);

        // устанавливаем адаптер списку
        list.setAdapter(adapter);
    }

}
