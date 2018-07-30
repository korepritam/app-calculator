package com.example.pritam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Button btn9;
    private Button btn8;
    private Button btn7;
    private Button btn6;
    private Button btn5;
    private Button btn4;
    private Button btn3;
    private Button btn2;
    private Button btn1;
    private Button btn0;
    private Button btnmul;
    private Button btndiv;
    private Button btnadd;
    private Button btnsub;
    private Button btnequ;
    private Button btnbck;
    private Button btnclr;
    private Button btnright;
    private Button btnleft;
    private TextView exp;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn9=(Button)findViewById(R.id.btn9);
        btn8=(Button)findViewById(R.id.btn8);
        btn7=(Button)findViewById(R.id.btn7);
        btn6=(Button)findViewById(R.id.btn6);
        btn5=(Button)findViewById(R.id.btn5);
        btn4=(Button)findViewById(R.id.btn4);
        btn3=(Button)findViewById(R.id.btn3);
        btn2=(Button)findViewById(R.id.btn2);
        btn1=(Button)findViewById(R.id.btn1);
        btn0=(Button)findViewById(R.id.btn0);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnequ=(Button)findViewById(R.id.btnequ);
        btnbck=(Button)findViewById(R.id.btnbck);
        btnclr=(Button)findViewById(R.id.btnclr);
        btnright=(Button)findViewById(R.id.btnright);
        btnleft=(Button)findViewById(R.id.btnleft);
        exp=(TextView)findViewById(R.id.exp);
        res=(TextView)findViewById(R.id.res);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"9");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"7");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"6");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"5");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"4");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"3");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"2");
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"1");
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"0");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"*");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"/");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"+");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"-");
            }
        });
        btnbck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= exp.getText().toString();
                if (str.length()>0) {
                    exp.setText(str.substring(0, str.length() - 1));
                }
                else
                    exp.setText("");
            }
        });




        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText("");
                res.setText("");
            }
        });

        btnright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+"(");
            }
        });

        btnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText()+")");
            }
        });

        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }

        });



     }




}
