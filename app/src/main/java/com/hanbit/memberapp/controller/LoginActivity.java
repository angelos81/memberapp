package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etID, etPass;
    Button btSubmit, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etID = (EditText) findViewById(R.id.etID);
        etPass = (EditText) findViewById(R.id.etPass);

        btSubmit = (Button) findViewById(R.id.btSubmit);
        btCancel = (Button) findViewById(R.id.btCancel);

        btSubmit.setOnClickListener(this);
        btCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String id = String.valueOf(etID.getText());
        String pass = String.valueOf(etPass.getText());

        switch (view.getId()){
            case R.id.btSubmit:
                this.startActivity(new Intent(LoginActivity.this, ListActivity.class));
                break;
            case R.id.btCancel:
                this.startActivity(new Intent(LoginActivity.this, ListActivity.class));
                break;
        }
    }
}
