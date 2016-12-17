package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class FindActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etSearch;
    Button btSearch, btCancel, btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        //EditText
        etSearch = (EditText) findViewById(R.id.etSearch);

        //Button
        btSearch = (Button) findViewById(R.id.btSearch);
        btCancel = (Button) findViewById(R.id.btCancel);
        btReset = (Button) findViewById(R.id.btReset);

        btSearch.setOnClickListener(this);
        btCancel.setOnClickListener(this);
        btReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btSearch:

                break;
            case R.id.btCancel:
                this.startActivity(new Intent(FindActivity.this, ListActivity.class));
                break;
            case R.id.btReset:
                etSearch.setText("");
                break;
        }
    }
}
