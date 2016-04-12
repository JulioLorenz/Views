package br.com.ftec.julio.views;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SelecaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);

        /*Button validar = (Button) findViewById(R.id.buttonValidar);
        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SelecaoActivity.this);
                builder.setTitle("Validação");
                builder.setMessage("Você quer validar esses dados?");
                builder.setCancelable(false);
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        validar();
                    }
                });
                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //não faz nada
                    }
                });
                builder.create().show();

            }
        });*/
    }

    private void validar(){
        String sTexto = "";

        RadioButton ads = (RadioButton) findViewById(R.id.radioButtonADS);
        RadioButton gestao = (RadioButton) findViewById(R.id.radioButtonGestao);
        RadioButton redes = (RadioButton) findViewById(R.id.radioButtonRedes);

        CheckBox java = (CheckBox) findViewById(R.id.checkBoxJava);
        CheckBox c = (CheckBox) findViewById(R.id.checkBoxC);
        CheckBox banco = (CheckBox) findViewById(R.id.checkBoxBanco);

        Switch aprovado = (Switch) findViewById(R.id.switchAprovado);

        ToggleButton liga = (ToggleButton) findViewById(R.id.toggleButton);

        if (ads.isChecked())
            sTexto = "ADS\n";

        if (gestao.isChecked())
            sTexto = "Gestão\n";

        if (redes.isChecked())
            sTexto = "Redes\n";

        if (java.isChecked())
            sTexto += "Java\n";

        if (c.isChecked())
            sTexto += "C\n";

        if (banco.isChecked())
            sTexto += "Banco\n";

        if (aprovado.isChecked())
            sTexto += "Aprovado\n";
        else
            sTexto += "Reprovado\n";

        if (liga.isChecked())
            sTexto += "Alertas On";
        else
            sTexto += "Alertas Off";

        alerta(sTexto);

    }

    private void alerta(String mensagem) {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(mensagem);
        dlgAlert.setTitle("Atenção");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }




}