package com.example.topographicmaps.openFile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.topographicmaps.R;
import com.example.topographicmaps.tests.SelectTest;
import com.github.barteksc.pdfviewer.PDFView;

public class OpenFile extends AppCompatActivity {
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_file);

        str = getIntent().getStringExtra("name");
      //  System.out.println(str);



        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset(str).load();

    }
}
