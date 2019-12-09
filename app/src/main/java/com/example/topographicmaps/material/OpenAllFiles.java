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
        else if (theme.equals("1") && file.equals("0")){
            pdfView.fromAsset("presentation/pres5.2.pdf").load();
        }
        else if (theme.equals("1") && file.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.2.pdf").load();
        }
        else if (theme.equals("1") && file.equals("2")){
            pdfView.fromAsset("test2.pdf").load();
        }
        else if (theme.equals("2") && file.equals("0")){
            pdfView.fromAsset("presentation/pres5.3.pdf").load();
        }
        else if (theme.equals("2") && file.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.3.pdf").load();
        }
        else if (theme.equals("2") && file.equals("2")){
            pdfView.fromAsset("test3.pdf").load();
        }
        else if (theme.equals("3") && file.equals("0")){
            pdfView.fromAsset("presentation/pres5.4.pdf").load();
        }
        else if (theme.equals("3") && file.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.4.pdf").load();
        }
        else if (theme.equals("3") && file.equals("2")){
            pdfView.fromAsset("test4.pdf").load();
        }
        else if (theme.equals("4") && file.equals("0")){
            pdfView.fromAsset("presentation/pres5.5.pdf").load();
        }
        else if (theme.equals("4") && file.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.5.pdf").load();
        }
        else if (theme.equals("4") && file.equals("2")){
            pdfView.fromAsset("test5.pdf").load();
        }
        else if (theme.equals("5") && file.equals("0")){
            pdfView.fromAsset("presentation/pres5.6.pdf").load();
        }
        else if (theme.equals("5") && file.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.6.pdf").load();
        }
        else if (theme.equals("5") && file.equals("2")){
            pdfView.fromAsset("test6.pdf").load();
        }
    }
}
