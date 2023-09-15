package com.example.calculatorapppabbu;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import android.widget.EditText;




public class MainActivity extends AppCompatActivity{ //implements View.OnClickListener{
    public EditText edittxt1, edittxt2;
    public Button addbutton,subbutton,mulbutton, divbutton;
    public  TextView result;
    int number1, number2;


    @SuppressLint("MissingInflatedId")

    EditText ageET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittxt1= (EditText)findViewById(R.id.editText1);
        edittxt2=findViewById(R.id.editText2);
        addbutton=findViewById(R.id.buttonplus);
        result=findViewById(R.id.viewResult);

        //addbutton.setOnClickListener(this);
        //number1=Integer.parseInt(edittxt1.getText().toString()); // has to be inside a function
    //    number2=Integer.parseInt(edittxt2.getText().toString()); // has to be inside of a function.


    }

    public void methodSum(View v){
        int sum=number1+number2;
        result.setText(sum);
        number1=Integer.parseInt(edittxt1.getText().toString());
        number2=Integer.parseInt(edittxt2.getText().toString());
    }

    //@Override
    /*public void onClick(View view) {
        if(edittxt2.getText().toString().equals(" ")){
            Toast.makeText(this,"Enter number",Toast.LENGTH_SHORT).show();
        }
        number1=Integer.parseInt(edittxt1.getText().toString());
        number2=Integer.parseInt(edittxt2.getText().toString());

        if(addbutton == view.getId()){
            result.setText(number1+number2);


        }

    }

     */


}