package com.example.topographicmaps.material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.topographicmaps.R;
import com.github.barteksc.pdfviewer.PDFView;

public class OpenAllFiles extends AppCompatActivity {
    String theme;
    String file;
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_all_files);

        pdfView = findViewById(R.id.pdfChoose);

        theme = getIntent().getStringExtra("numberTheme");
        file = getIntent().getStringExtra("numberFile");

        choose();
    }


    protected void choose(){
        if (theme.equals("0") && file.equals("0")){
            pdfView.fromAsset("presentation/pres5.1.pdf").load();
        }
        else if (theme.equals("0") && file.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.1.pdf").load();
        }
        else if (theme.equals("0") && file.equals("2")){
            pdfView.fromAsset("test1.pdf").load();
        }
    }
}
