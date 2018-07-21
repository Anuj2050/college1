package com.example.anuj.college;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class firstscreenfirst extends AppCompatActivity {
    public TextView tvUser, tvOr;
   public int i =0;
    public Button btLogin, btSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreenfirst);

        tvUser=findViewById(R.id.tv_user);
        tvOr=findViewById(R.id.tv_or);
        btLogin=findViewById(R.id.bt_login);
        btSignup=findViewById(R.id.bt_Signup);


        btSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firstscreenfirst.this, firstscreen.class);
                startActivity(intent);
            }
        });
       btLogin.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                Intent intents = new Intent(firstscreenfirst.this, loginpage.class);

                intents.putExtra("inte",i);
               startActivity(intents);

            }
       });

    }
}
