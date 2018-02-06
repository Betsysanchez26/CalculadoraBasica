package com.example.betsysanchez.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button suma;
    TextView operando1;
    TextView operador;
    Button resta;
    Button mul;
    Button div;
    Button punto;
    Button igual;
    Button limpiar;
    EditText cajita;
    float op1;
    float op2;
    int conSuma;
    boolean ban;
    boolean pun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conSuma=0;
        ban=false;
        pun=false;
        limpiar=findViewById(R.id.btnC);
        resta=findViewById(R.id.btnMenos);
        mul=findViewById(R.id.btnPor);
        punto=findViewById(R.id.btnPunto);
        div=findViewById(R.id.btnEntre);
        operando1=findViewById(R.id.textView);
        operador=findViewById(R.id.oper);
        b0=findViewById(R.id.btn0);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn8);
        suma=findViewById(R.id.btnMas);
        igual=findViewById(R.id.btnIgual);
        cajita=findViewById(R.id.textView2);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("1");
                ban=false;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("2");
                ban=false;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("3");
                ban=false;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("4");
                ban=false;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("5");
                ban=false;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("6");
                ban=false;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("7");
                ban=false;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("8");
                ban=false;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.append("9");
                ban=false;
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pun==false){
                    cajita.append(".");
                }else{return;}
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ban==true){
                    operador.setText("+");
                }else{
                    ban=true;
                }
                if(conSuma==0){
                    op1=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    operando1.setText(op1+"");
                    operador.setText("+");
                    conSuma++;
                }else if(cajita.getText().toString().equals("")){
                    return;
                }else{
                    op1=Float.parseFloat(operando1.getText().toString());
                    op2=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    float res=op1+op2;
                    operando1.setText(res+"");
                    operador.setText("+");
                }
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ban==true){
                    operador.setText("-");
                }else{
                    ban=true;
                }
                if(conSuma==0){
                    op1=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    operando1.setText(op1+"");
                    operador.setText("-");
                    conSuma++;
                }else if(cajita.getText().toString().equals("")){
                    return;
                }else{
                    op1=Float.parseFloat(operando1.getText().toString());
                    op2=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    float res=op1-op2;
                    operando1.setText(res+"");
                    operador.setText("-");

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ban==true){
                    operador.setText("/");
                }else{
                    ban=true;
                }
                if(conSuma==0){
                    op1=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    operando1.setText(op1+"");
                    operador.setText("/");
                    conSuma++;
                }else if(cajita.getText().toString().equals("")){
                    return;
                }else{
                    op1=Float.parseFloat(operando1.getText().toString());
                    op2=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    float res=op1/op2;
                    operando1.setText(res+"");
                    operador.setText("/");

                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ban==true){
                    operador.setText("*");
                }else{
                    ban=true;
                }
                if(conSuma==0){
                    op1=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    operando1.setText(op1+"");
                    operador.setText("*");
                    conSuma++;
                }else if(cajita.getText().toString().equals("")){
                        return;
                    }else{
                    op1=Float.parseFloat(operando1.getText().toString());
                    op2=Float.parseFloat(cajita.getText().toString());
                    cajita.setText("");
                    float res=op1*op2;
                    operando1.setText(res+"");
                    operador.setText("*");

                }
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cajita.getText().toString().equals("")&& operando1.getText().toString().equals("")){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Faltan operandos", Toast.LENGTH_LONG);
                    toast1.show();
                    return;
                }
                if(cajita.getText().toString().equals("")||operando1.getText().toString().equals("")){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Falta un operando 1", Toast.LENGTH_LONG);
                    toast1.show();
                    return;
                }else{
                op1=Float.parseFloat(operando1.getText().toString());
                op2=Float.parseFloat(cajita.getText().toString());}
                if(operador.getText().equals("+")){
                    cajita.setText(op1+op2+"");
                    operando1.setText("");
                    operador.setText("");
                    conSuma=0;
                }else if(operador.getText().equals("-")){
                    cajita.setText(op1-op2+"");
                    operando1.setText("");
                    operador.setText("");
                    conSuma=0;
                }else if(operador.getText().equals("/")){
                    cajita.setText(op1/op2+"");
                    operando1.setText("");
                    operador.setText("");
                    conSuma=0;
                }else if(operador.getText().equals("*")){
                    cajita.setText(op1*op2+"");
                    operando1.setText("");
                    operador.setText("");
                    conSuma=0;
                }
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cajita.setText("");
                operando1.setText("");
                operador.setText("");
                conSuma=0;
                op1=0;
                op2=0;

            }
        });

    }
    }




