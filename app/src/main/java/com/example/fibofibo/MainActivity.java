package com.example.fibofibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    EditText et1;
    TextView tv1;
    Button btnResult;


    public int fibonacci(int numero){
        //caso base
        if ((numero == 0) || (numero == 1))
            return numero;
            //llamada recursiva
        else
            return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt1);
        tv1 = (TextView)findViewById(R.id.lblResultado);

        btnResult = (Button)findViewById(R.id.Enviar);
        btnResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        float n1,res;
        n1  = Float.parseFloat(et1.getText().toString());
        res = 0;

        for (int i = 0; i < n1; i++) {
            res =  fibonacci(i);
            tv1.setText("El resultado es " + res);
        }
        Toast.makeText(getApplicationContext(),"El resultado es "+ res,Toast.LENGTH_LONG).show();

    }
}