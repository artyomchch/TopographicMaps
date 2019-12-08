package com.example.topographicmaps.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.topographicmaps.R;

public class SelectTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_test);

        ListView listView = findViewById(R.id.listOfTests);

// определяем строковый массив
        final String[] testNames = new String[] {
                "Тест 1", "Тест 2", "Тест 3", "Тест 4", "Тест 5",
                "Тест 6", "Тест 7", "Тест 8", "Тест 9", "Тест 10",
                "Тест 11", "Тест 12", "Тест 13", "Тест 14", "Тест 15",
                "Тест 16", "Тест 17", "Тест 18", "Тест 19", "Тест 20"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, testNames);

        listView.setAdapter(adapter);
    }
}
