package com.example.anuj.college;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {
    //   public EditText etUser,etPassword;
//    public TextView tvLogin;
    public EditText etuser, etpassword;
    public Button btEnterprofile;
    public String firstname, lastname, add, dob, phnumber;
    public int inters;
    private static final String TAG = "MyActivity";

    //constants

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        //     etUser= findViewById(R.id.et_username);
        //     etPassword=findViewById(R.id.et_password);

        // tvLogin = findViewById(R.id.tv_login);
        btEnterprofile = findViewById(R.id.bt_profile);
        etuser = findViewById(R.id.et_username);
        etpassword = findViewById(R.id.et_password);

        Bundle bundle = getIntent().getExtras();
        inters = bundle.getInt("FirstScreenValue");

        //     user=etUser.getText().toString().trim();
        //     password=etPassword.getText().toString().trim();

        switch (inters) {
            case 1: {
//                Log.i(TAG, "onCreate: Abc");
                firstname = bundle.getString("FirstScreenFirstname");
                lastname = bundle.getString("FirstScreenLastname");
                phnumber = bundle.getString("FirstScreenPhone");
                add = bundle.getString("FirstScreenAddress");
                dob = bundle.getString("FirstScreenDob");
                inters = bundle.getInt("FirstScreenValue");
                etuser.setText(getIntent().getStringExtra("FirstScreenusername"));
                etpassword.setText(getIntent().getStringExtra("FirstScreenpassword"));


                btEnterprofile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //   if (user)

                        Intent inte = new Intent(loginpage.this, userprofile.class);
                        inte.putExtra("fstname", firstname);
                        inte.putExtra("lstname", lastname);
                        inte.putExtra("phn", phnumber);
                        inte.putExtra("addr", add);
                        inte.putExtra("dobr", dob);
                        startActivity(inte);
                    }
                });
            }
            case 0: {
                btEnterprofile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent inten = new Intent(loginpage.this, userprofile.class);
                        inten.putExtra("username", etuser.getText().toString().trim());
                        inten.putExtra("password", etpassword.getText().toString().trim());
                        startActivity(inten);

                    }
                });

            }

        }
    }


}
