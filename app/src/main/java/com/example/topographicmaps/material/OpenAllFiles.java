package com.example.topographicmaps.material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.topographicmaps.R;
import com.github.barteksc.pdfviewer.PDFView;

public class OpenAllFiles extends AppCompatActivity {
    String theme;
    String file;
    String soldier;
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_all_files);

        pdfView = findViewById(R.id.pdfChoose);

        theme = getIntent().getStringExtra("numberTheme");   // Это НОМЕР ТЕМЫ
        file = getIntent().getStringExtra("numberFile");  // Номер файла
        soldier = getIntent().getStringExtra("officer");   // Солдат 0 , оффицер 1
        System.out.println("ss");
        choose();
    }


    // Только попробуйте мне сказать про мой гавнокод, на месте ушатаю, и без вас знаю!
    // значит, так епт, внизу в "choose" 3 бл значения:
    // первое значение может быть от 0 до хуй его знает скольки, зависит от ваших тем!!
    // второе будет всегда от 0 до 2, где 0 презентация, 1 учебный материал, 2 задачи по материал
    // третье будет либо 0, либо 1, где 0- это солдат, 1 - оффицер


    protected void choose(){
        if (theme.equals("0") && file.equals("0") && soldier.equals("1")) {
            pdfView.fromAsset("presentation/pres5.1.pdf").load();
        }
        else if (theme.equals("0") && file.equals("1") && soldier.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.1.pdf").load();
        }
        else if (theme.equals("0") && file.equals("2") && soldier.equals("1")){
            pdfView.fromAsset("test1.pdf").load();
        }
        else if (theme.equals("1") && file.equals("0") && soldier.equals("1")){
            pdfView.fromAsset("presentation/pres5.2.pdf").load();
        }
        else if (theme.equals("1") && file.equals("1") && soldier.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.2.pdf").load();
        }
        else if (theme.equals("1") && file.equals("2") && soldier.equals("1")){
            pdfView.fromAsset("test2.pdf").load();
        }
        else if (theme.equals("2") && file.equals("0") && soldier.equals("1")){
            pdfView.fromAsset("presentation/pres5.3.pdf").load();
        }
        else if (theme.equals("2") && file.equals("1") && soldier.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.3.pdf").load();
        }
        else if (theme.equals("2") && file.equals("2") && soldier.equals("1")){
            pdfView.fromAsset("test3.pdf").load();
        }
        else if (theme.equals("3") && file.equals("0") && soldier.equals("1")){
            pdfView.fromAsset("presentation/pres5.4.pdf").load();
        }
        else if (theme.equals("3") && file.equals("1") && soldier.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.4.pdf").load();
        }
        else if (theme.equals("3") && file.equals("2") && soldier.equals("1")){
            pdfView.fromAsset("test4.pdf").load();
        }
        else if (theme.equals("4") && file.equals("0") && soldier.equals("1")){
            pdfView.fromAsset("presentation/pres5.5.pdf").load();
        }
        else if (theme.equals("4") && file.equals("1") && soldier.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.5.pdf").load();
        }
        else if (theme.equals("4") && file.equals("2") && soldier.equals("1")){
            pdfView.fromAsset("test5.pdf").load();
        }
        else if (theme.equals("5") && file.equals("0") && soldier.equals("1")){
            pdfView.fromAsset("presentation/pres5.6.pdf").load();
        }
        else if (theme.equals("5") && file.equals("1") && soldier.equals("1")){
            pdfView.fromAsset("lectMat/lectMat5.6.pdf").load();
        }
        else if (theme.equals("5") && file.equals("2") && soldier.equals("1")){
            pdfView.fromAsset("test6.pdf").load();
        }


        else if (theme.equals("0") && file.equals("0") && soldier.equals("0")) {
            pdfView.fromAsset("presentation/pres5.1.pdf").load();
        }
        else if (theme.equals("0") && file.equals("1") && soldier.equals("0")){
            pdfView.fromAsset("lectMat/lectMat5.1.pdf").load();
        }
        else if (theme.equals("0") && file.equals("2") && soldier.equals("0")){
            pdfView.fromAsset("test1.pdf").load();
        }
        else if (theme.equals("1") && file.equals("0") && soldier.equals("0")){
            pdfView.fromAsset("presentation/pres5.2.pdf").load();
        }
        else if (theme.equals("1") && file.equals("1") && soldier.equals("0")){
            pdfView.fromAsset("lectMat/lectMat5.2.pdf").load();
        }
        else if (theme.equals("1") && file.equals("2") && soldier.equals("0")){
            pdfView.fromAsset("test2.pdf").load();
        }
        else if (theme.equals("2") && file.equals("0") && soldier.equals("0")){
            pdfView.fromAsset("presentation/pres5.3.pdf").load();
        }
        else if (theme.equals("2") && file.equals("1") && soldier.equals("0")){
            pdfView.fromAsset("lectMat/lectMat5.3.pdf").load();
        }
        else if (theme.equals("2") && file.equals("2") && soldier.equals("0")){
            pdfView.fromAsset("test3.pdf").load();
        }
        else if (theme.equals("3") && file.equals("0") && soldier.equals("0")){
            pdfView.fromAsset("presentation/pres5.4.pdf").load();
        }
        else if (theme.equals("3") && file.equals("1") && soldier.equals("0")){
            pdfView.fromAsset("lectMat/lectMat5.4.pdf").load();
        }
        else if (theme.equals("3") && file.equals("2") && soldier.equals("0")){
            pdfView.fromAsset("test4.pdf").load();
        }
        else if (theme.equals("4") && file.equals("0") && soldier.equals("0")){
            pdfView.fromAsset("presentation/pres5.5.pdf").load();
        }
        else if (theme.equals("4") && file.equals("1") && soldier.equals("0")){
            pdfView.fromAsset("lectMat/lectMat5.5.pdf").load();
        }
        else if (theme.equals("4") && file.equals("2") && soldier.equals("0")){
            pdfView.fromAsset("test5.pdf").load();
        }
        else if (theme.equals("5") && file.equals("0") && soldier.equals("0")){
            pdfView.fromAsset("presentation/pres5.6.pdf").load();
        }
        else if (theme.equals("5") && file.equals("1") && soldier.equals("0")){
            pdfView.fromAsset("lectMat/lectMat5.6.pdf").load();
        }
        else if (theme.equals("5") && file.equals("2") && soldier.equals("0")){
            pdfView.fromAsset("test6.pdf").load();
        }
    }
}
