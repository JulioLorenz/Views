package br.com.ftec.julio.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTexto = (Button) findViewById(R.id.buttonTexto);
        buttonTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextoActivity.class);
                startActivity(intent);
            }
        });

        Button buttonSelecao = (Button) findViewById(R.id.buttonSelecao);
        buttonSelecao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelecaoActivity.class);
                startActivity(intent);
            }
        });

        Button buttonBrowser = (Button) findViewById(R.id.buttonBrowser);
        buttonBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                startActivity(intent);
            }
        });

        Button buttonHora = (Button) findViewById(R.id.buttonHora);
        buttonHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HoraActivity.class);
                startActivity(intent);
            }
        });

        Button buttonData = (Button) findViewById(R.id.buttonData);
        buttonData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });

        Button buttonRelogio = (Button) findViewById(R.id.buttonRelogio);
        buttonRelogio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelogioActivity.class);
                startActivity(intent);
            }
        });

        Button buttonNota = (Button) findViewById(R.id.buttonNota);
        buttonNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotaActivity.class);
                startActivity(intent);
            }
        });



    }
}
