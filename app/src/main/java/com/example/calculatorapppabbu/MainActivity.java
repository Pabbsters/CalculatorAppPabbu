package com.example.calculatorapppabbu;

import static java.lang.Double.sum;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import android.widget.EditText;




public class MainActivity extends AppCompatActivity{
    public EditText edittxt1, edittxt2;
    public Button addbutton,subbutton,mulbutton, divbutton;
    public TextView textresult;


    @SuppressLint("MissingInflatedId")

    EditText ageET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittxt1= (EditText)findViewById(R.id.editText1);
        edittxt2= (EditText)findViewById(R.id.editText2);
        addbutton=(Button)findViewById(R.id.buttonplus);
        subbutton=(Button)findViewById(R.id.buttonminus);
        mulbutton=(Button)findViewById(R.id.buttonmul);
        divbutton=(Button)findViewById(R.id.buttondiv);
        textresult = (TextView) findViewById(R.id.viewResult);


    // Performing Addition of 2 numbers
    addbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
          if((edittxt1.getText().length()>0) && (edittxt2.getText().length()>0)){
              double num1=Double.parseDouble((edittxt1.getText().toString()));
              double num2=Double.parseDouble((edittxt2.getText().toString()));
              double result= num1+num2;
              textresult.setText(Double.toString(result));
          }
          else{
              Toast toast=Toast.makeText(MainActivity.this," Enter the numbers", Toast.LENGTH_LONG);
              toast.show();
          }

        }

    });

        // Performing Subtraction of 2 numbers
        subbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((edittxt1.getText().length()>0) && (edittxt2.getText().length()>0)){
                    double num1=Double.parseDouble((edittxt1.getText().toString()));
                    double num2=Double.parseDouble((edittxt2.getText().toString()));
                    double result= num1-num2;
                    textresult.setText(Double.toString(result));
                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this," Enter the numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });

        // Performing Multiplication  of 2 numbers
        mulbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((edittxt1.getText().length()>0) && (edittxt2.getText().length()>0)){
                    double num1=Double.parseDouble((edittxt1.getText().toString()));
                    double num2=Double.parseDouble((edittxt2.getText().toString()));
                    double result= num1*num2;
                    textresult.setText(Double.toString(result));
                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this," Enter the numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });
        // Performing Division of 2 numbers
        divbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((edittxt1.getText().length()>0) && (edittxt2.getText().length()>0)){
                    double num1=Double.parseDouble((edittxt1.getText().toString()));
                    double num2=Double.parseDouble((edittxt2.getText().toString()));
                    double result= num1 / num2;
                    textresult.setText(Double.toString(result));
                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this," Enter the numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });
    }

}