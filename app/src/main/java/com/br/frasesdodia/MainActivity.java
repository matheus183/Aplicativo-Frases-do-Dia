package com.br.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarnovafrase(View view){

        String [] frases = {
          "Voce e foda",
                "Voce vai dominar omundo",
                "Vamo pra Cima",
                "Tudo Nosso"
        };

        int numero = new Random().nextInt(4); // 0.1.2.3

        TextView texto = findViewById(R.id.resultado);
        texto.setText(frases[numero]);

    }




    }







}