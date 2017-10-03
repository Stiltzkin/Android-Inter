package com.example.kawag.capsulecorp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnDetalhes = (Button) findViewById(R.id.consultar_btn);
        btnDetalhes.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View view){
                        Intent intent = new Intent(MenuActivity.this, BuscaActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
