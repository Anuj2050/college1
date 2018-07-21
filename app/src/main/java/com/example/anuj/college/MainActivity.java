package com.example.anuj.college;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tvWelcome,tvTemple;
    public Button btProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome=findViewById(R.id.tv_welcome);
        tvTemple=findViewById(R.id.tv_temple);
        btProceed=findViewById(R.id.bt_proceed);

        btProceed.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent= new Intent(MainActivity.this,firstscreenfirst.class);
            startActivity(intent);
        }
    });
}

}