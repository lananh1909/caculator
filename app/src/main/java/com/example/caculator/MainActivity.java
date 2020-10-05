package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothClass;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input;
    TextView result;
    TextView view;
    String viewCaculation = "";
    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, nghichdao, mode, sqr, sqrt, decimal, equal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);
        view = findViewById(R.id.view);

        final Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("0");
                result.setText("0");
                view.setText("");
                viewCaculation = "";
            }
        });


        Button btn22 = findViewById(R.id.btn22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("0");
                } else {
                    in.append("0");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "0";
                view.setText(viewCaculation);
            }
        });

        Button btn17 = findViewById(R.id.btn17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("1");
                } else {
                    in.append("1");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "1";
                view.setText(viewCaculation);
            }
        });

        Button btn18 = findViewById(R.id.btn18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("2");
                } else {
                    in.append("2");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "2";
                view.setText(viewCaculation);
            }
        });

        Button btn19 = findViewById(R.id.btn19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("3");
                } else {
                    in.append("3");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "3";
                view.setText(viewCaculation);
            }
        });

        Button btn13 = findViewById(R.id.btn13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("4");
                } else {
                    in.append("4");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "4";
                view.setText(viewCaculation);
            }
        });

        Button btn14 = findViewById(R.id.btn14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("5");
                } else {
                    in.append("5");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "5";
                view.setText(viewCaculation);
            }
        });

        Button btn15 = findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("6");
                } else {
                    in.append("6");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "6";
                view.setText(viewCaculation);
            }
        });

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("7");
                } else {
                    in.append("7");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "7";
                view.setText(viewCaculation);
            }
        });

        Button btn10 = findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("8");
                } else {
                    in.append("8");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "8";
                view.setText(viewCaculation);
            }
        });

        Button btn11 = findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("9");
                } else {
                    in.append("9");
                    if (in.length() > 8) {
                        input.setTextSize(30);
                    }
                    input.setText(in.toString());
                }
                viewCaculation += "9";
                view.setText(viewCaculation);
            }
        });

        Button btn20 = findViewById(R.id.btn20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Addition = true;
                decimal = false;
                input.setText("0");

                viewCaculation += "+";
                view.setText(viewCaculation);
            }
        });

        Button btn16 = findViewById(R.id.btn16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Subtract = true;
                decimal = false;
                input.setText("0");

                viewCaculation += "-";
                view.setText(viewCaculation);
            }
        });

        Button btn12 = findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Multiplication = true;
                decimal = false;
                input.setText("0");

                viewCaculation += "*";
                view.setText(viewCaculation);
            }
        });

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Division = true;
                decimal = false;
                input.setText("0");

                viewCaculation += "/";
                view.setText(viewCaculation);
            }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                mode = true;
                decimal = false;
                input.setText("0");

                viewCaculation += "%";
                view.setText(viewCaculation);
            }
        });

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                nghichdao = true;
                decimal = false;
                input.setText("0");

                viewCaculation = "1/";
                view.setText(viewCaculation);
            }
        });

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                sqrt = true;
                decimal = false;
                input.setText("0");

                viewCaculation = "sqrt(";
                view.setText(viewCaculation);
            }
        });

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                sqr = true;
                decimal = false;
                viewCaculation += "^2";
                view.setText(viewCaculation);
                input.setText(viewCaculation);
            }
        });

        Button btn24 = findViewById(R.id.btn24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equal = true;
                if (sqr) {
                    result.setText(input1 * input1 + "");
                    sqr = false;
                }
                if (sqrt) {
                    input1 = Double.parseDouble(input.getText().toString());
                    result.setText(Math.sqrt(input1) + "");
                    sqrt = false;
                }
                if (nghichdao) {
                    input1 = Double.parseDouble(input.getText().toString());
                    result.setText(1/input1 + "");
                    nghichdao = false;
                }
                if (Addition || Subtract || Multiplication || Division || mode) {
                    input2 = Double.parseDouble(input.getText().toString());
                }
                if (Addition) {
                    result.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract) {
                    result.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if (Multiplication) {
                    result.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    result.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mode) {
                    result.setText((int)input1 % (int)input2 + "");
                    mode = false;
                }
                input.setText("0");
            }
        });

        Button btn23 = findViewById(R.id.btn23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btn4.callOnClick();
                    equal = false;
                }
                if (decimal) {

                } else {
                    StringBuffer in = new StringBuffer();
                    in.append(input.getText().toString());
                    in.append(".");
                    input.setText(in.toString());
                    decimal = true;
                    viewCaculation += ".";
                    view.setText(viewCaculation);
                }
            }
        });


    }
}