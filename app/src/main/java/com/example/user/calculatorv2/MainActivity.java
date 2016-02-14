package com.example.user.calculatorv2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;       //for using buttons
import android.widget.TextView;     //for output

public class MainActivity extends AppCompatActivity {
    public String sign = "";
    public String total = "";
    public Double tempDouble, tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Create number buttons
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        //Create buttons for operations
        Button buttonExp = (Button)findViewById(R.id.buttonExp);
        Button buttonXY = (Button)findViewById(R.id.buttonXY);
        Button buttonTenEx = (Button)findViewById(R.id.buttonTenEx);
        Button buttonC = (Button)findViewById(R.id.buttonC);    //clear
        Button buttonLN = (Button)findViewById(R.id.buttonLN);
        Button buttonSin = (Button)findViewById(R.id.buttonSin);
        Button buttonSqrt = (Button)findViewById(R.id.buttonSqrt);
        Button buttonD = (Button)findViewById(R.id.buttonD);    //divide
        Button buttonM = (Button)findViewById(R.id.buttonM);    //multiply
        Button buttonS = (Button)findViewById(R.id.buttonS);    //subtract
        Button buttonA = (Button)findViewById(R.id.buttonA);    //add
        Button buttonR = (Button)findViewById(R.id.buttonR);    //equals sign
        Button buttonP = (Button)findViewById(R.id.buttonP);    //decimal

        //Create textview object


        //Creates event handlers for each button

        button0.setOnClickListener(
            new Button.OnClickListener()
            {
                public void onClick(View v)
                {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("0");
                }
            }
        );

        button1.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        button2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        button3.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );

        button4.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );

        button5.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );

        button6.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );

        button7.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        button8.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );

        button9.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        buttonP.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append(".");
                    }
                }
        );

        buttonC.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );

        //create event handlers for operations

        buttonA.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="+";
                    }
                }
        );

        buttonS.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="-";
                    }
                }
        );

        buttonM.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="*";
                    }
                }
        );

        buttonD.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="/";
                    }
                }
        );

        buttonExp.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="exp";
                    }
                }
        );

        buttonTenEx.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="tenex";
                    }
                }
        );

        buttonLN.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="ln";
                    }
                }
        );

        buttonSin.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="sin";
                    }
                }
        );

        buttonSqrt.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="sqrt";
                    }
                }
        );

        buttonXY.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign="xy";
                    }
                }
        );

        //define result event handler when user presses "="
        buttonR.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);

                        //depending on what the sign is
                        if (sign == "+") {
                            tempDouble2 = Double.parseDouble(output.getText().toString());
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        }
                        else if (sign == "-") {
                            tempDouble2 = Double.parseDouble(output.getText().toString());
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        }
                        else if (sign == "*") {
                            tempDouble2 = Double.parseDouble(output.getText().toString());
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        }
                        else if (sign == "/") {
                            tempDouble2 = Double.parseDouble(output.getText().toString());
                            if (tempDouble2 == 0) {
                                output.setText("Cannot divide by zero");
                            } else {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }
                        else if (sign.equals("exp")) {
                            double value = Math.exp(tempDouble);
                            output.setText(Double.toString(value));
                        }
                        else if (sign.equals("tenex")) {
                            double value = Math.exp(tempDouble * 2.3025850929940457);
                            output.setText(Double.toString(value));
                        }
                        else if (sign.equals("ln")) {
                            double value = Math.log(tempDouble);
                            output.setText(Double.toString(value));
                        }
                        else if (sign.equals("sqrt")) {
                            double value = Math.sqrt(tempDouble);
                            output.setText(Double.toString(value));
                        }
                        else if (sign.equals("sin")) {
                            double value = Math.sin(tempDouble);
                            output.setText(Double.toString(value));     //note: gives different result than test...
                        }
                        else if (sign.equals("xy")) {
                            tempDouble2 = Double.parseDouble(output.getText().toString());
                            double value = Math.pow(tempDouble, tempDouble2);
                            output.setText(Double.toString(value));
                        }

                        sign="";
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
