package br.com.ftec.julio.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Button buttonOk = (Button) findViewById(R.id.buttonDataOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePicker data = (DatePicker) findViewById(R.id.datePicker);
                alerta(String.valueOf(data.getDayOfMonth()) + "/" + String.valueOf(data.getMonth() + "/" + String.valueOf(data.getYear())));
            }
        });
    }

    private void alerta(String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show(); }
}
