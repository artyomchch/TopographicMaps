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
                "Тема 1", "Тема 2", "Тема 3", "Тема 4", "Тема 5",
                "Тема 6", "Тема 7", "Тема 8", "Тема 9", "Тема 10",
                "Тема 11", "Тема 12", "Тема 13", "Тема 14", "Тема 15",
                "Тема 16", "Тема 17", "Тема 18", "Тема 19", "Тема 20"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, themeNames);

        listView.setAdapter(adapter);
    }
}
