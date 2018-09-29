package id.uchidd.projectutssemester1;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Case9Activity extends AppCompatActivity {

    Button btSnackbar;
    CoordinatorLayout clCase9;
    Snackbar snackbarCase9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case9);

        btSnackbar = (Button)findViewById(R.id.btSnackbar);
        clCase9 = (CoordinatorLayout)findViewById(R.id.clCase9);

        btSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbarCase9 = Snackbar.make(clCase9, "Hello Rabbannii", Snackbar.LENGTH_LONG);
                snackbarCase9.show();
            }
        });

    }
}
