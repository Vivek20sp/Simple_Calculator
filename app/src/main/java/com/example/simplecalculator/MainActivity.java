package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText Input1;
    EditText Input2;
    TextView Result;

    public void OnClickClearText1(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Input1.setText(" ");
        }
    }
    public void OnClickClearText2(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
           Input2.setText(" ");
        }
    }
    public void OnClickSum(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String number1=Input1.getText().toString().trim();
            String number2=Input2.getText().toString().trim();
            double num=Integer.parseInt(number1);
            double num2=Integer.parseInt(number2);
            double res=num+num2;
            String resMain=Double.toString(res);
            Result.setText(resMain);
        }
    }
    public void OnClickSubtraction(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String number1=Input1.getText().toString().trim();
            String number2=Input2.getText().toString().trim();
            double num=Integer.parseInt(number1);
            double num2=Integer.parseInt(number2);
            double res=num-num2;
            String resMain=Double.toString(res);
            Result.setText(resMain);
        }
    }
    public void OnClickMultiplication(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String number1=Input1.getText().toString().trim();
            String number2=Input2.getText().toString().trim();
            double num=Integer.parseInt(number1);
            double num2=Integer.parseInt(number2);
            double res=num*num2;
            String resMain=Double.toString(res);
            Result.setText(resMain);
        }
    }
    public void OnClickDivision(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String number1=Input1.getText().toString().trim();
            String number2=Input2.getText().toString().trim();
            double num=Integer.parseInt(number1);
            double num2=Integer.parseInt(number2);
            double res=num/num2;
            String resMain=Double.toString(res);
            Result.setText(resMain);
        }
    }
    public void OnClickPercentage(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String number1=Input1.getText().toString().trim();
            String number2=Input2.getText().toString().trim();
            double num=Integer.parseInt(number1);
            double num2=Integer.parseInt(number2);
            double res=(num/num2)*100;
            String resMain=Double.toString(res);
            Result.setText(resMain);
        }
    }
    public void OnClickDeleteAll(View view)
    {
        if(Input1.getText().toString().isEmpty()||Input2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please Enter Number In Both Text Bar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Input1.setText(" ");
            Input2.setText(" ");
            Result.setText(" ");
        }
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input1=findViewById(R.id.text1);
        Input2=findViewById(R.id.text3);
        Result=findViewById(R.id.result);
    }
}