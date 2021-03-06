package com.example.comparador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText iten_1, iten_2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iten_1 = findViewById(R.id.iten_1);
        iten_2 = findViewById(R.id.iten_1);
        resultado = findViewById(R.id.Resultado);

    }

    public void CompararValue(View view) {
        //recuperar valores digitados
        String Preçoiten_1 = iten_1.getText(Preçoiten_1);
        String Preçoiten_2 = iten_2.getText(Preçoiten_2);


        boolean camposvalidados = validarCampos(iten_1, iten_2);
        if (camposvalidados) {
            //convert string to number
            Double valorIten1 = Double.parseDouble(Preçoiten_1);
            Double valorIten2 = Double.parseDouble(Preçoiten_2);

            if (valorIten1 > valorIten2) {
                resultado.setText("Melhor item 2");
            } else {
                resultado.setText("Melhor o item 1");
            }


        }
    }

}
