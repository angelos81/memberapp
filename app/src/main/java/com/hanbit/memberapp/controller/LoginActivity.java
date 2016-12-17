package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hanbit.memberapp.R;
import com.hanbit.memberapp.domain.MemberBean;
import com.hanbit.memberapp.service.MemberService;
import com.hanbit.memberapp.service.MemberServiceImpl;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etID, etPass;
    Button btLogin, btCancel;

    //Bean
    MemberBean member;

    //Service
    MemberService service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //EditText
        etID = (EditText) findViewById(R.id.etID);
        etPass = (EditText) findViewById(R.id.etPass);

        //Button
        btLogin = (Button) findViewById(R.id.btLogin);
        btCancel = (Button) findViewById(R.id.btCancel);

        //Event
        btLogin.setOnClickListener(this);
        btCancel.setOnClickListener(this);

        //Service
        service = new MemberServiceImpl(this.getApplicationContext());  //객체를 만드는데 다른곳에 만들지 말고 LoginActivity에 만들어라...(즉, 위치값을 지정)

        member = new MemberBean();
    }

    @Override
    public void onClick(View view) {
        String id = String.valueOf(etID.getText());
        String pass = String.valueOf(etPass.getText());
        Log.d("Input id:", id);
        Log.d("Input pass:", pass);

        member.setId(id);
        member.setPass(pass);

        switch (view.getId()){
            case R.id.btLogin:
                if(service.login(member)){
                    //LoginActivity.this : LoginActivity에 띄워라...
                    Toast.makeText(LoginActivity.this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();

                    //Login 성공 후 List로 이동
                    this.startActivity(new Intent(LoginActivity.this, ListActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this, "LOGIN FAIL", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.btCancel:
                this.startActivity(new Intent(LoginActivity.this, ListActivity.class));
                break;
        }
    }
}
