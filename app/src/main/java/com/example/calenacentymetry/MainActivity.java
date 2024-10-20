package com.example.calenacentymetry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cale, centymetry;
    Button naCentymetry, naCale;


    // 1 cal to 2,54
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cale = findViewById(R.id.cale);
        centymetry = findViewById(R.id.centymetry);
        naCentymetry = findViewById(R.id.naCentymetry);
        naCale = findViewById(R.id.naCale);

        naCentymetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String caleStr = cale.getText().toString();
                if (caleStr.length() > 0) {
                    Double caleDbl = Double.parseDouble(caleStr);
                    Double centymetryDbl = caleDbl * 2.54d;
                    centymetry.setText(String.format("%.2f", centymetryDbl));
                }

            }
        });

        naCale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String centymetryStr = centymetry.getText().toString();
                if (centymetryStr.length() > 0) {
                    Double centymetryDbl = Double.parseDouble(centymetryStr);
                    Double caleDbl = centymetryDbl / 2.54d;
                    cale.setText(String.format("%.2f", caleDbl ));
                }
            }
        });


    }
}