package id.uchidd.projectutssemester1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Case12SecondActivity extends AppCompatActivity {

    Button btCase12Second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case12_second);

        btCase12Second = (Button)findViewById(R.id.btCase12Second);

        btCase12Second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Case12First = new Intent(Case12SecondActivity.this, Case12FirstActivity.class);
                startActivity(Case12First);

            }
        });

    }
}
