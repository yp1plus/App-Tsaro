package com.example.tsaro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);
    }

    public void entrar(View view){
        Intent login = new Intent (this, TelaPrincipal.class);
        startActivity(login);
    }
}
