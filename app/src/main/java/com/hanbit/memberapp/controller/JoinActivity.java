package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etID, etPass, etName, etTel, etAddr;
    Button btSubmit, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        //EditText
        etID = (EditText) findViewById(R.id.etID);
        etPass = (EditText) findViewById(R.id.etName);
        etName = (EditText) findViewById(R.id.etID);
        etTel = (EditText) findViewById(R.id.etTel);
        etAddr = (EditText) findViewById(R.id.etAddr);

        //Button
        btSubmit = (Button) findViewById(R.id.btSubmit);
        btCancel = (Button) findViewById(R.id.btCancel);

        btSubmit.setOnClickListener(this);
        btCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String id = String.valueOf(etID.getText());
        String pass = String.valueOf(etPass.getText());
        String name = String.valueOf(etName.getText());
        String tel = String.valueOf(etTel.getText());
        String addr = String.valueOf(etAddr.getText());

        switch (view.getId()){
            case R.id.btSubmit:

                break;
            case R.id.btCancel:
                this.startActivity(new Intent(JoinActivity.this, ListActivity.class));
                break;
        }
    }
}
