package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1;
    private EditText e2;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        t1=(TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2;
                if(e1.getText().toString()==null||e1.getText().toString().equals("")) {
                    num1 = 0;
                }else {
                    num1 = Integer.parseInt(e1.getText().toString());
                }
                if(e2.getText().toString()==null||e2.getText().toString().equals("")) {
                    num2 = 0;
                }
                else {
                    num2 = Integer.parseInt(e2.getText().toString());
                }
                    int result=num1+num2;
                    t1.setText(String.valueOf(result));
                }

        });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int num1,num2;
                        if(e1.getText().toString()==null||e1.getText().toString().equals("")) {
                            num1 = 0;
                        }else {
                            num1 = Integer.parseInt(e1.getText().toString());
                        }
                        if(e2.getText().toString()==null||e2.getText().toString().equals("")) {
                            num2 = 0;
                        }
                        else {
                            num2 = Integer.parseInt(e2.getText().toString());
                        }
                        int result=num1-num2;
                        t1.setText("Answer="+String.valueOf(result));
                    }
                });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2;
                if(e1.getText().toString()==null||e1.getText().toString().equals("")) {
                    num1 = 0;
                }else {
                    num1 = Integer.parseInt(e1.getText().toString());
                }
                if(e2.getText().toString()==null||e2.getText().toString().equals("")) {
                    num2 = 0;
                }
                else {
                    num2 = Integer.parseInt(e2.getText().toString());
                }
                int result=num1*num2;
                t1.setText("Answer="+String.valueOf(result));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2;
                if(e1.getText().toString()==null||e1.getText().toString().equals("")) {
                    num1 = 0;
                }else {
                    num1 = Integer.parseInt(e1.getText().toString());
                }
                if(e2.getText().toString()==null||e2.getText().toString().equals("")) {
                    num2 = 0;
                }
                else {
                    num2 = Integer.parseInt(e2.getText().toString());
                }
                int result=num1/num2;
                t1.setText("Answer="+String.valueOf(result));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1,num2;
                if(e1.getText().toString()==null||e1.getText().toString().equals("")) {
                    num1 = 0;
                }else {
                    num1 = Integer.parseInt(e1.getText().toString());
                }
                if(e2.getText().toString()==null||e2.getText().toString().equals("")) {
                    num2 = 0;
                }
                else {
                    num2 = Integer.parseInt(e2.getText().toString());
                }
                int i;
                for(i=1;i<num2;) {
                    i += num1 * num1;
                    i--;
                }
                t1.setText("Answer="+String.valueOf(i));
            }
        });
    }
}