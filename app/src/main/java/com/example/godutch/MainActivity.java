package com.example.godutch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText etPrice,etNum;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPrice = (EditText) findViewById(R.id.editText_price);
        etNum = (EditText) findViewById(R.id.editText_num);
        tvDisplay = (TextView) findViewById(R.id.textView_display);
    }

    public void btn_OK(View v){
        double dbPrice = Double.parseDouble(etPrice.getText().toString());
        int iNum = Integer.parseInt(etNum.getText().toString());
        double dbShare = dbPrice/iNum;
        dbShare = Double.valueOf(Math.round(dbShare*100))/100;

        tvDisplay.setText("The amount to share is "+dbShare);
    }
}
