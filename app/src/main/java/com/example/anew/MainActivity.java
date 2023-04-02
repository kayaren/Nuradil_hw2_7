package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Boolean isOperationClick;
    private String operation= "";
    private  Integer first, second, sum;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView = findViewById(R.id.text_view);
        Button ravno = findViewById(R.id.btn_ravno);
        Button second = findViewById(R.id.btn_second);

        findViewById(R.id.btn_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = textView.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("kay", data);
                startActivity(intent);
            }
        });
          ravno.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  second.setVisibility(View.VISIBLE);
              }
          });


    }

   public void setNumber (String number) {
        if (textView.getText().toString().equals("0") || isOperationClick){
            textView.setText(number);
        }else {
            textView.append(number);
        }
    }



 public void onNumberClick (View view){
        switch (view.getId()){
            case R.id.bnt_1:
              setNumber("1");
                break;
            case R.id.btn_2:
                setNumber("2");
                break;
            case R.id.btn_3:
               setNumber("3");
                break;
            case R.id.bnt_4:
                setNumber("4");
                break;
            case R.id.btn_5:
                setNumber("5");
                break;
            case R.id.btn_6:
                setNumber("6");
                break;
            case R.id.bnt_7:
                setNumber("7");
                break;
            case R.id.btn_8:
                setNumber("8");
                break;
            case R.id.btn_9:
                setNumber("9");
                break;
            case R.id.btn_0:
                setNumber("0");
                break;
            case R.id.bnt_c:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick (View view){
        switch (view.getId()){
            case R.id.btn_plus:
                operation = "+";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_ravno:
                second = Integer.valueOf(textView.getText().toString());
               switch (operation){
                   case "+":
                       sum = first + second;
                       break;
                   case "-":
                       sum = first -second;
                       break;
                   case "x":
                       sum = first * second;
                       break;
                   case "/":
                       sum = first / second;
                       break;
               }
                textView.setText(sum.toString());
                break;
            case R.id.btn_min:
                operation = "-";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_um:
                operation = "x";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_raz:
                operation = "/";
                first = Integer.valueOf(textView.getText().toString());
                break;




        }
        isOperationClick = true;
    }


}