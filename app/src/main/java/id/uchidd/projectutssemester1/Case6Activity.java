package id.uchidd.projectutssemester1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Case6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case6);

        Handler tahan_splash = new Handler();
        tahan_splash.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toMain = new Intent(Case6Activity.this, MainActivity.class);
                startActivity(toMain);

            }
        }, 4000);

    }
}
