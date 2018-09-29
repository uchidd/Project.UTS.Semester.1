package id.uchidd.projectutssemester1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Case12FirstActivity extends AppCompatActivity {

    Button btCase12First;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case12_first);

        btCase12First = (Button)findViewById(R.id.btCase12First);

        btCase12First.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent case12Second = new Intent(Case12FirstActivity.this, Case12SecondActivity.class);
                startActivity(case12Second);
            }
        });

    }
}
