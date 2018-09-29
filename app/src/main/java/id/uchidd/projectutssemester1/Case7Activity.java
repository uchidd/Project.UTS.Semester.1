package id.uchidd.projectutssemester1;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Case7Activity extends AppCompatActivity {

    Button btToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case7);

        btToast = (Button)findViewById(R.id.btToast);

        btToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Case7Activity.this, "Hello Rabbannii", Toast.LENGTH_LONG).show();
            }
        });

    }
}
