package id.uchidd.projectutssemester1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btToCase5, btToCase6, btToCase7, btToCase8, btToCase9, btToCase10, btToCase12, btToCase17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btToCase5 = (Button)findViewById(R.id.btToCase5);
        btToCase6 = (Button)findViewById(R.id.btToCase6);
        btToCase7 = (Button)findViewById(R.id.btToCase7);
        btToCase8 = (Button)findViewById(R.id.btToCase8);
        btToCase9 = (Button)findViewById(R.id.btToCase9);
        btToCase10 = (Button)findViewById(R.id.btToCase10);
        btToCase12 = (Button)findViewById(R.id.btToCase12);
        btToCase17 = (Button)findViewById(R.id.btToCase17);


        btToCase5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase5 = new Intent(MainActivity.this, Case5Activity.class);
                startActivity(ToCase5);

            }
        });
        btToCase6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase6 = new Intent(MainActivity.this, Case6Activity.class);
                startActivity(ToCase6);

            }
        });
        btToCase7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase7 = new Intent(MainActivity.this, Case7Activity.class);
                startActivity(ToCase7);

            }
        });
        btToCase8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase8 = new Intent(MainActivity.this, Case8Activity.class);
                startActivity(ToCase8);

            }
        });
        btToCase9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase9 = new Intent(MainActivity.this, Case9Activity.class);
                startActivity(ToCase9);

            }
        });
        btToCase10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase10 = new Intent(MainActivity.this, Case10Activity.class);
                startActivity(ToCase10);

            }
        });
        btToCase12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase12 = new Intent(MainActivity.this, Case12FirstActivity.class);
                startActivity(ToCase12);

            }
        });
        btToCase17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ToCase17 = new Intent(MainActivity.this, Case17Activity.class);
                startActivity(ToCase17);

            }
        });

    }
}
