package com.example.anuj.college;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class firstscreen extends AppCompatActivity {
    public TextView tvHeader;
    public EditText etFirstname, etLastname,etPhone,etAddress, etDob,etPer,etApplicantuser,etapplicantpassword;
    public Button btRegister, btcancel;
    public String firstname, lastname, phonenumber, address,per ,dob,applicantuser,applicantpassword;
    public int i =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
        tvHeader=findViewById(R.id.tv_header);
        etFirstname=findViewById(R.id.edt_first_name);
        etLastname=findViewById(R.id.edt_last_name);
        etPhone=findViewById(R.id.et_phonenumber);
        etAddress=findViewById(R.id.et_address);
        etDob=findViewById(R.id.et_dob);
        etApplicantuser=findViewById(R.id.et_applicantuser);
        etapplicantpassword=findViewById(R.id.et_applicantpassword);
        etPer=findViewById(R.id.et_per);
        btRegister=findViewById(R.id.bt_register);
        btcancel=findViewById(R.id.bt_cancel);

      btRegister.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               firstname=etFirstname.getText().toString().trim();
               lastname=etLastname.getText().toString().trim();
               phonenumber=etPhone.getText().toString().trim();
               address=etAddress.getText().toString().trim();
               per=etPer.getText().toString().trim();
               dob=etDob.getText().toString().trim();
               applicantuser=etApplicantuser.getText().toString().trim();
               applicantpassword=etapplicantpassword.getText().toString().trim();

   //            int perc = Integer.parseInt(per);
   //            while (perc>=50) {
   //                btRegister.setEnabled(false);
//               }
               if (TextUtils.isEmpty(firstname)){
                   Toast.makeText(firstscreen.this,"First name cannot be empty",Toast.LENGTH_SHORT).show();
               } else if (TextUtils.isEmpty(lastname)){
                   Toast.makeText(firstscreen.this, "Last name cannotbe empty",Toast.LENGTH_SHORT).show();
               }else if (TextUtils.isEmpty(phonenumber)){
                   Toast.makeText(firstscreen.this, "Phone Number Cannot be empty",Toast.LENGTH_SHORT).show();
                   }else if (TextUtils.isEmpty(address)){
                   Toast.makeText(firstscreen.this,"Address Cannot be empty",Toast.LENGTH_SHORT).show();
               }else if (TextUtils.isEmpty(dob)){
                   Toast.makeText(firstscreen.this,"DOB Cannot be Empty",Toast.LENGTH_SHORT).show();
               }else if (TextUtils.isEmpty(applicantuser)){
                   Toast.makeText(firstscreen.this,"Username Cannot be Empty",Toast.LENGTH_SHORT).show();
               }else if (TextUtils.isEmpty(applicantpassword)){
                   Toast.makeText(firstscreen.this,"Password Cannot be Empty",Toast.LENGTH_SHORT).show();
               }
               else {
                   FormValue();
               }
           }
                private void FormValue(){
                    Intent firstintent= new Intent(firstscreen.this,loginpage.class);
                    firstintent.putExtra("FirstScreenFirstname",firstname);
                    firstintent.putExtra("FirstScreenLastname",lastname);
                    firstintent.putExtra("FirstScreenPhone",phonenumber);
                    firstintent.putExtra("FirstScreenAddress",address);
                    firstintent.putExtra("FirstScreenDob",dob);
                    firstintent.putExtra("FirstScreenusername",applicantuser);
                    firstintent.putExtra("FirstScreenpassword",applicantpassword);
                    firstintent.putExtra("FirstScreenValue",i);
                    startActivity(firstintent);


                }
    });
                        btcancel.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finish();
                            }
                        });
    }}
