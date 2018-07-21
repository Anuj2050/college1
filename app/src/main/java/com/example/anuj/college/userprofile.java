package com.example.anuj.college;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class userprofile extends AppCompatActivity {
    public TextView tvappcantFirst,tvuserFirst,tvappcantlast,tvprofile, tvuserLast,tvappcantDob,tvuserDob,tvuseraddress,tvappcantaddress,tvappcantphone,tvuserphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        tvappcantFirst=findViewById(R.id.tv_appcantfirst);
        tvuserFirst=findViewById(R.id.tv_userfirst);
        tvappcantlast=findViewById(R.id.tv_appcantlast);
        tvuserLast=findViewById(R.id.tv_userlast);
        tvappcantDob=findViewById(R.id.tv_dobapplicant);
        tvuseraddress=findViewById(R.id.tv_useraddress);
        tvuserDob=findViewById(R.id.tv_userdob);
        tvappcantaddress=findViewById(R.id.tv_appcantaddress);
        tvappcantphone=findViewById(R.id.tv_phoneappcant);
        tvuserphone=findViewById(R.id.tv_phoneuser);
        tvprofile=findViewById(R.id.tv_profile);

//hgfh hfghfmbj
        tvuserFirst.setText(getIntent().getStringExtra("fstname"));
        tvuserLast.setText(getIntent().getStringExtra("lstname"));
        tvuserDob.setText(getIntent().getStringExtra("dobr"));
        tvuseraddress.setText(getIntent().getStringExtra("addr"));
        tvuserphone.setText(getIntent().getStringExtra("phn"));


    }
}
