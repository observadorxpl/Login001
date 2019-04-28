package com.joseluis.login;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

        if (username.getText().toString().equals("Administrador") && password.getText().toString().equals("123")) {

            Intent intent = new Intent(this, ContainnerActivity.class);
            startActivity(intent);
        }else if (username.getText().toString().equals("Gerente") && password.getText().toString().equals("1234")) {

            Intent intent = new Intent(this, ContainnerActivity.class);
            startActivity(intent);
        }else  if (username.getText().toString().equals("Personal") && password.getText().toString().equals("12345")) {

            Intent intent = new Intent(this, ContainnerActivity.class);
            startActivity(intent);
        }

        else{

            Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}