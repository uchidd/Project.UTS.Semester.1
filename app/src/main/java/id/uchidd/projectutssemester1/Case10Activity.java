package id.uchidd.projectutssemester1;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import id.uchidd.projectutssemester1.Case10.Case10;

public class Case10Activity extends Case10 {

    CoordinatorLayout clCase10A;
    EditText etInputACase10A, etInputBCase10A;
    Button btHasilCase10A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case10);

        clCase10A = (CoordinatorLayout)findViewById(R.id.clCase10);
        etInputACase10A = (EditText)findViewById(R.id.etInputACase10A);
        etInputBCase10A = (EditText)findViewById(R.id.etInputBCase10A);
        btHasilCase10A = (Button) findViewById(R.id.btHasilCase10A);

        btHasilCase10A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int nilaiAcase10 = Integer.parseInt(etInputACase10A.getText().toString());
                int nilaiBcase10 = Integer.parseInt(etInputBCase10A.getText().toString());
                penjumlahanCase10(nilaiAcase10, nilaiAcase10);

            }
        });

    }
}
