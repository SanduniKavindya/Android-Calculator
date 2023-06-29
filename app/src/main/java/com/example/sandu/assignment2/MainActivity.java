package com.example.sandu.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.btnGo);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openCalculator();

            }

        });

 }
    public void openCalculator(){
        Intent intent=new Intent(this, Calculator.class);
        startActivity(intent);
    }
}




