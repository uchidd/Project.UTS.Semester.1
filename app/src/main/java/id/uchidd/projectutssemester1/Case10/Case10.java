package id.uchidd.projectutssemester1.Case10;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Case10 extends AppCompatActivity {

    Context contextCase10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contextCase10 = Case10.this;

    }

    public int penjumlahanCase10(int nilaiAcase10, int nilaiBcase10){

        int hasilCase10 = nilaiAcase10 + nilaiBcase10;
        Toast.makeText(this, "Hasil penjumlahan: " + hasilCase10, Toast.LENGTH_LONG).show();
        return hasilCase10;
    }

}
