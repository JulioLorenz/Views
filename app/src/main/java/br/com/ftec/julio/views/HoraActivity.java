package br.com.ftec.julio.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class HoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        Button buttonOk = (Button) findViewById(R.id.buttonHoraOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
                alerta(String.valueOf(timePicker.getCurrentHour()) + ":" + String.valueOf(timePicker.getCurrentMinute()));
            }
        });
    }

    private void alerta(String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show(); }
}
