package com.hanbit.memberapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.memberapp.controller.JoinActivity;
import com.hanbit.memberapp.controller.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btJoin, btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button을 인스턴스화 함 (인스턴스화 시키지 않으면 NullPointerException)
        btJoin = (Button) findViewById(R.id.btJoin);
        btLogin = (Button) findViewById(R.id.btLogin);

        //Button instancd에 event
        btJoin.setOnClickListener(this);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btJoin:
                //toast
                //Toast.makeText(MainActivity.this, "Click Join", Toast.LENGTH_LONG).show();

                //intent
                //from A to B : 지금 나(MainActivity)로부터 JoinActivity로 이동하라
                //Intent intent = new Intent(MainActivity.this, JoinActivity.class);
                //this.startActivity(intent);

                this.startActivity(new Intent(MainActivity.this, JoinActivity.class));
                break;
            case R.id.btLogin:
                //Toast.makeText(MainActivity.this, "Click Login", Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
        }
    }
}
