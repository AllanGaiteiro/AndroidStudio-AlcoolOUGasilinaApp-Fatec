package com.example.alcoolougazolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClick(View view){
        // declare
        TextView textViewGazoline = findViewById(R.id.txtPriceGazoline);
        TextView textViewAlcool = findViewById(R.id.txtPriceAlcool);
        TextView textViewResult = findViewById(R.id.result);
        Double priceGazoline = Double.parseDouble(textViewGazoline.getText().toString());
        Double priceAlcool = Double.parseDouble(textViewAlcool.getText().toString());

        // condition
        if(!priceAlcool.isNaN() || !priceAlcool.equals(null) || !priceGazoline.isNaN() || !priceGazoline.equals(null)){
            String result = this.verifyAlcoolOrGazoline(priceAlcool,priceGazoline);
            textViewResult.setText(result +" compensa Mais");
        }else{
            textViewResult.setText("valor invalido");
        }

    }
    private String verifyAlcoolOrGazoline(Double alcool,Double gazoline){
        Double result = alcool / gazoline;
        return (result < 0.7? "Alcool":"Gasolina");
    }
}