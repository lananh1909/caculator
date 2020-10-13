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
    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, decimal, equal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);

        final Button btnc = findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("0");
                Addition = false;
                Multiplication = false;
                Subtract = false;
                Division = false;
                decimal = false;
            }
        });

        Button btnce = findViewById(R.id.btnce);
        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("0");
            }
        });

        Button btnbs = findViewById(R.id.btnbs);
        btnbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal){
                    btnc.callOnClick();
                    equal = false;
                } else {
                    String recent = input.getText().toString();
                    input.setText(recent.substring(0, recent.length()-1));
                }
            }
        });


        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("0");
                } else {
                    in.append("0");
                    input.setText(in.toString());
                }
            }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("1");
                } else {
                    in.append("1");
                    input.setText(in.toString());
                }
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("2");
                } else {
                    in.append("2");
                    input.setText(in.toString());
                }
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("3");
                } else {
                    in.append("3");
                    input.setText(in.toString());
                }
            }
        });

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("4");
                } else {
                    in.append("4");
                    input.setText(in.toString());
                }
            }
        });

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("5");
                } else {
                    in.append("5");
                    input.setText(in.toString());
                }
            }
        });

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("6");
                } else {
                    in.append("6");
                    input.setText(in.toString());
                }
            }
        });

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("7");
                } else {
                    in.append("7");
                    input.setText(in.toString());
                }
            }
        });

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("8");
                } else {
                    in.append("8");
                    input.setText(in.toString());
                }
            }
        });

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                StringBuffer in = new StringBuffer();
                in.append(input.getText().toString());
                if (in.toString().equals("0")) {
                    input.setText("9");
                } else {
                    in.append("9");
                    input.setText(in.toString());
                }
            }
        });

        Button btnadd = findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Addition = true;
                decimal = false;
                input.setText("0");
            }
        });

        Button btnsub = findViewById(R.id.btnsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Subtract = true;
                decimal = false;
                input.setText("0");
            }
        });

        Button btnmul = findViewById(R.id.btnmul);
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Multiplication = true;
                decimal = false;
                input.setText("0");
            }
        });

        Button btndiv = findViewById(R.id.btndiv);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                input1 = Double.parseDouble(input.getText().toString());
                Division = true;
                decimal = false;
                input.setText("0");
            }
        });

        Button btnequal = findViewById(R.id.btnequal);
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equal = true;
                if (Addition || Subtract || Multiplication || Division) {
                    input2 = Double.parseDouble(input.getText().toString());
                }
                if (Addition) {
                    double result = input1 + input2;
                    int result1 = (int) result;
                    if (result1 == result) {
                        input.setText(result1 + "");
                    } else {
                        input.setText(result + "");
                    }
                    Addition = false;
                }
                if (Subtract) {
                    double result = input1 - input2;
                    int result1 = (int) result;
                    if (result1 == result) {
                        input.setText(result1 + "");
                    } else {
                        input.setText(result + "");
                    }
                    Subtract = false;
                }
                if (Multiplication) {
                    double result = input1 * input2;
                    int result1 = (int) result;
                    if (result1 == result) {
                        input.setText(result1 + "");
                    } else {
                        input.setText(result + "");
                    }
                    Multiplication = false;
                }
                if (Division) {
                    double result = input1 / input2;
                    int result1 = (int) result;
                    if (result1 == result) {
                        input.setText(result1 + "");
                    } else {
                        input.setText(result + "");
                    }
                    Division = false;
                }
            }
        });

        Button btndec = findViewById(R.id.btndec);
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equal) {
                    btnc.callOnClick();
                    equal = false;
                }
                if (decimal) {

                } else {
                    StringBuffer in = new StringBuffer();
                    in.append(input.getText().toString());
                    in.append(".");
                    input.setText(in.toString());
                    decimal = true;
                }
            }
        });


    }
}