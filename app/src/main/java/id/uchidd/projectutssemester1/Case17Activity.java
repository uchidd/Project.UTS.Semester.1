package id.uchidd.projectutssemester1;

import android.content.DialogInterface;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Case17Activity extends AppCompatActivity {

    EditText etInputCase17;
    Button btAlertDialogCase17, btSnackbarCase17, btToastCase17;
    AlertDialog.Builder AlertDialogCase17;
    Snackbar SnackbarCase17;
    CoordinatorLayout clCase17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case17);

        clCase17 = (CoordinatorLayout)findViewById(R.id.clCase17);
        etInputCase17 = (EditText)findViewById(R.id.etInputCase17);
        btAlertDialogCase17 = (Button)findViewById(R.id.btAlertDialogCase17);
        btSnackbarCase17 = (Button)findViewById(R.id.btSnackbarCase17);
        btToastCase17 = (Button)findViewById(R.id.btToastCase17);
        AlertDialogCase17 = new AlertDialog.Builder(this);

        btAlertDialogCase17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialogCase17.setTitle("Tampilkan").setMessage(etInputCase17.getText().toString()).setNegativeButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                AlertDialog runDialog = AlertDialogCase17.create();
                runDialog.show();

            }
        });

        btSnackbarCase17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SnackbarCase17.make(clCase17,etInputCase17.getText().toString(), Snackbar.LENGTH_LONG).show();

            }
        });

        btToastCase17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Case17Activity.this,etInputCase17.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });

    }
}
