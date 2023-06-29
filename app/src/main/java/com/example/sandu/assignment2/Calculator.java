package com.example.sandu.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class Calculator extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final EditText et1=(EditText)findViewById(R.id.editText);
        final EditText et2=(EditText)findViewById(R.id.editText2);
        final EditText et3=(EditText)findViewById(R.id.editText3);

        Button clear=(Button)findViewById(R.id.btnClear);
        clear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                et1.getText().clear();
                et2.getText().clear();
                et3.getText().clear();
            }
        });
    }


    public void Add(View v){
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);
        EditText et3=(EditText)findViewById(R.id.editText3);

        double n1=Double.parseDouble(et1.getText().toString());
        double n2=Double.parseDouble(et2.getText().toString());
        double result=n1+n2;

        et3.setText("Total Value = " + result);

    }

    public void Subtract(View v){
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);
        EditText et3=(EditText)findViewById(R.id.editText3);

        double n1=Double.parseDouble(et1.getText().toString());
        double n2=Double.parseDouble(et2.getText().toString());
        double result=n1-n2;

        et3.setText("Subtract Value = " + result);

    }

    public void Multiply(View v){
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);
        EditText et3=(EditText)findViewById(R.id.editText3);

        double n1=Double.parseDouble(et1.getText().toString());
        double n2=Double.parseDouble(et2.getText().toString());
        double result=n1*n2;

        et3.setText("Multiply Value = " + result);

    }

    public void Divide(View v){
        EditText et1=(EditText)findViewById(R.id.editText);
        EditText et2=(EditText)findViewById(R.id.editText2);
        EditText et3=(EditText)findViewById(R.id.editText3);

        double n1=Double.parseDouble(et1.getText().toString());
        double n2=Double.parseDouble(et2.getText().toString());
        double result=n1/n2;

        et3.setText("Divide Value = " + result);

    }


}
