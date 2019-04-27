package com.joseluis.login;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view) {
       /*
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);*/
    }

    public void goLoginAccount(View view) {
        TextInputEditText username = (TextInputEditText) findViewById(R.id.login_username);
        TextInputEditText password = (TextInputEditText) findViewById(R.id.login_password);

        if (username.getText().toString().equals("usuario01") && password.getText().toString().equals("123456")) {

            Intent intent = new Intent(this, ContainnerActivity.class);
            startActivity(intent);
        }
    }
}