package br.com.ftec.julio.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        RatingBar estrelas = (RatingBar) findViewById(R.id.ratingBar);
        estrelas.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                alerta(String.valueOf(ratingBar.getRating()));
            }
        });

        SeekBar barra = (SeekBar) findViewById(R.id.seekBar);
        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView texto = (TextView) findViewById(R.id.textViewNota);
                texto.setText(String.valueOf(i));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        Button buttonMax = (Button) findViewById(R.id.buttonMax);
        buttonMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RatingBar estrelas = (RatingBar) findViewById(R.id.ratingBar);
                estrelas.setRating((float) 5);
                //estrelas.setNumStars(10); se quiser colocar mais estrelas

                SeekBar barra = (SeekBar) findViewById(R.id.seekBar);
                barra.setProgress(10);
            }
        });
    }

    private void alerta(String mensagem){
        Toast.makeText(this,mensagem, Toast.LENGTH_SHORT).show(); }
}
