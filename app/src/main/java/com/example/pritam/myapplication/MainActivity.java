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
                String s=exp.getText().toString();
                char[] tokens = s.toCharArray();
               // String s1=String.valueOf(tokens);
                // Stack for numbers: 'values'
                Stack<Integer> values = new Stack<Integer>();

                // Stack for Operators: 'ops'
                Stack<Character> ops = new Stack<Character>();

                for (int i = 0; i < tokens.length; i++)
                {
                    // Current token is a whitespace, skip it
                    if (tokens[i] == ' ')
                        continue;

                    // Current token is a number, push it to stack for numbers
                    if (tokens[i] >= '0' && tokens[i] <= '9')
                    {
                        StringBuffer sbuf = new StringBuffer();
                        // There may be more than one digits in number
                        while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                            sbuf.append(tokens[i++]);
                        i--;
                        values.push(Integer.parseInt(sbuf.toString()));
                    }

                    // Current token is an opening brace, push it to 'ops'
                    else if (tokens[i] == '(')
                        ops.push(tokens[i]);

                        // Closing brace encountered, solve entire brace
                    else if (tokens[i] == ')')
                    {
                        while (ops.peek() != '(')
                            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                        ops.pop();
                    }

                    // Current token is an operator.
                    else if (tokens[i] == '+' || tokens[i] == '-' ||
                            tokens[i] == '*' || tokens[i] == '/')
                    {
                        // While top of 'ops' has same or greater precedence to current
                        // token, which is an operator. Apply operator on top of 'ops'
                        // to top two elements in values stack
                        while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                            values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                        // Push current token to 'ops'.
                        ops.push(tokens[i]);
                    }
                }
                // Entire expression has been parsed at this point, apply remaining
                // ops to remaining values
                while (!ops.empty())
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));

                // Top of 'values' contains result, return it
                String s1=String.valueOf(values.pop());
                res.setText(s1);
            }

        });



     }


     // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

}