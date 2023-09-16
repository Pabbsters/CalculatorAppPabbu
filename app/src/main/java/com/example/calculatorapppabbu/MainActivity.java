package com.example.calculatorapppabbu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

/** Tutorial used: https://abhiandroid.com/createandroidapp/create-calculator-app */
public class MainActivity extends AppCompatActivity{
    public EditText edittxt1, edittxt2;
    public Button addbutton,subbutton,mulbutton, divbutton, clrbutton;
    public TextView textresult;

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
        clrbutton= (Button) findViewById(R.id.buttonclear);



    /** Performing Addition of 2 numbers */
    /**  In order to define these arithmetic operations over the button click, we use
         setOnClickListener(this) function. It assigns listener for the Button on this instance -OnClickListener.
         OnClickListener() interface has an onClick(View v)method that is called when the view is clicked. */
    /** parseDouble converts string in to a double value */
    addbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
          if((edittxt1.getText().length()>0) && (edittxt2.getText().length()>0)){
              double num1=Double.parseDouble((edittxt1.getText().toString()));
              double num2=Double.parseDouble((edittxt2.getText().toString()));
              double result= num1+num2;
              textresult.setText(Double.toString(result));
          }
          /** If one clicks any of the buttons without entering the input, a Toast message will appear
           telling the user to enter the required input
           */

          else{
              Toast toast=Toast.makeText(MainActivity.this," Enter the numbers", Toast.LENGTH_LONG);
              toast.show();
          }

        }

    });

        /** Performing Subtraction of 2 numbers */
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

        /** Performing Multiplication  of 2 numbers */
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

        /** Performing Division of 2 numbers */
        divbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((edittxt1.getText().length()>0) && (edittxt2.getText().length()>0)){
                    double num1=Double.parseDouble((edittxt1.getText().toString()));
                    double num2=Double.parseDouble((edittxt2.getText().toString()));
                    double result= num1 / num2;
                    /** rounds result to two decimal places */
                    result = (double) Math.round(result * 100) / 100;
                    textresult.setText(Double.toString(result));
                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this," Enter the numbers", Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });

        /** Resetting Input Fields */
        /** When Clear button is clicked, onClick method for that view is called and resets all the input values
         to Zeroes and requestFocus() method will direct the control to a specific view */
        clrbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                edittxt1.setText("");
                edittxt2.setText("");
                textresult.setText("0.00");
                edittxt1.requestFocus();
            }
        });

    }

}