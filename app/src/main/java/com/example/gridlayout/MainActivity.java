package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDel , btnDivision , btn7 , btn8 , btn9, btnX, btn4,
        btn5 , btn6, btnMinus , btn1 , btn2 , btn3 , btn0 , btnPlus , btnEquals , btncalc;

    EditText editText;

    float valueOne , valueTwo;
    boolean addition , subtract , multiplication , division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declerations
        editText = (EditText) findViewById(R.id.editText);

        btncalc = (Button) findViewById(R.id.calculator);
        btnDel = (Button) findViewById(R.id.DEL);
        btnDivision = (Button) findViewById(R.id.division);
        btnMinus = (Button) findViewById(R.id.minus);
        btnPlus = (Button) findViewById(R.id.plus);
        btnEquals = (Button) findViewById(R.id.equals);
        btnX = (Button) findViewById(R.id.x);

        btn1 = (Button) findViewById(R.id.one);
        btn2 = (Button) findViewById(R.id.two);
        btn3 = (Button) findViewById(R.id.three);
        btn4 = (Button) findViewById(R.id.four);
        btn5 = (Button) findViewById(R.id.five);
        btn6 = (Button) findViewById(R.id.six);
        btn7 = (Button) findViewById(R.id.seven);
        btn8 = (Button) findViewById(R.id.eight);
        btn9 = (Button) findViewById(R.id.nine);
        btn0 = (Button) findViewById(R.id.zero);


    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText() + "1");
        }
    });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

    btnPlus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(editText == null){
                editText.setText("");
            }
        else{
            valueOne = Float.parseFloat(editText.getText()+ "");
            addition = true;
            editText.setText(null);
            }
        }
    });

    btnMinus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        valueOne = Float.parseFloat(editText.getText() + "");
        subtract = true;
        editText.setText(null);
        }
    });

    btnX.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            valueOne = Float.parseFloat(editText.getText() + "");
            multiplication = true;
            editText.setText(null);
        }
    });

    btnDivision.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            valueOne = Float.parseFloat(editText.getText() + "");
            division = true;
            editText.setText(null);
        }
    });

    btnEquals.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            valueTwo = Float.parseFloat(editText.getText() + "");

            if(addition == true) {
                editText.setText(valueOne + valueTwo + "");
                addition = false;
            }

            if (subtract == true){
                editText.setText(valueOne - valueTwo + "");
                subtract = false;
            }
            if (multiplication == true){
                editText.setText(valueOne * valueTwo + "");
                multiplication = false;
            }
            if(division == true){
                editText.setText(valueOne / valueTwo + "");
                division = false;
            }
        }
    });

    btnDel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editText.setText("");
        }
    });

    btncalc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Made In Turkey", Toast.LENGTH_LONG).show();
        }
    });


    }
}