package com.example.cicct.textstyler;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    CheckBox bold;
    CheckBox italic;
    RadioButton red;
    RadioButton green;
    RadioButton blue;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.txtInput);
        bold = (CheckBox) findViewById(R.id.ckBold);
        italic = (CheckBox) findViewById(R.id.ckItalic);
        red = (RadioButton) findViewById(R.id.rdRed);
        green = (RadioButton) findViewById(R.id.rdGreen);
        blue = (RadioButton) findViewById(R.id.rdBlue);
        result = (TextView) findViewById(R.id.txtResult);
    }
       private void perform(View view){
        boolean ckBold = bold.isChecked();
        boolean ckItalic = italic.isChecked();

        if(ckBold && ckItalic){
            result.setTypeface(null,Typeface.BOLD_ITALIC);
        }else
            if(ckBold){
                result.setText(input.getText());
                result.setTypeface(null,Typeface.BOLD);
//            }if (ckItalic){
//               result.setText(input.getText());
//               result.setTypeface(null,Typeface.ITALIC);
//            }if(ckBold && ckItalic){
//               result.setText(input.getText());
//               result.setTypeface(null,Typeface.NORMAL);
//            }
    }
}}

