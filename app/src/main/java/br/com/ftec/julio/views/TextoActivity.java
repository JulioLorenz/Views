package br.com.ftec.julio.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto);

        Button buttonOk = (Button) findViewById(R.id.buttonAcTextoOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nome = (EditText) findViewById(R.id.editTextNome);
                EditText profissao = (EditText) findViewById(R.id.editTextProfisao);
                EditText telefone = (EditText) findViewById(R.id.editTextTelefone);
                TextView resumo = (TextView) findViewById(R.id.textViewResumo);

                resumo.setText(nome.getText().toString() + ", " + profissao.getText().toString() + ", Fone " + telefone.getText());
            }
        });

        Button buttonLimpar = (Button) findViewById(R.id.buttonLimparTexto);
        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nome = (EditText) findViewById(R.id.editTextNome);
                EditText profissao = (EditText) findViewById(R.id.editTextProfisao);
                EditText telefone = (EditText) findViewById(R.id.editTextTelefone);
                TextView resumo = (TextView) findViewById(R.id.textViewResumo);

                nome.setText("");
                profissao.setText("");
                telefone.setText("");
                resumo.setText("Resumo");
            }
        });
    }
}
