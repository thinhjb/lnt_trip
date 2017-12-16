package com.trip.lnt.lnt_trip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener  {
    final Calculator cal = new Calculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button zero = (Button) findViewById(R.id.button0);
        zero.setOnClickListener(this);
        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(this);
        Button eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(this);
        Button add = (Button) findViewById(R.id.buttonA);
        add.setOnClickListener(this);
        Button subtract = (Button) findViewById(R.id.buttonS);
        subtract.setOnClickListener(this);
        Button multiply = (Button) findViewById(R.id.buttonX);
        multiply.setOnClickListener(this);
        Button divide = (Button) findViewById(R.id.buttonD);
        divide.setOnClickListener(this);
        Button AC = (Button) findViewById(R.id.buttonAC);
        AC.setOnClickListener(this);
        Button equal = (Button) findViewById(R.id.buttonE);
        equal.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.button0:
                    cal.input(0);
                    break;
                case R.id.button1:
                    cal.input(1);
                    break;
                case R.id.button2:
                    cal.input(2);
                    break;
                case R.id.button3:
                    cal.input(3);
                    break;
                case R.id.button4:
                    cal.input(4);
                    break;
                case R.id.button5:
                    cal.input(5);
                    break;
                case R.id.button6:
                    cal.input(6);
                    break;
                case R.id.button7:
                    cal.input(7);
                    break;
                case R.id.button8:
                    cal.input(8);
                    break;
                case R.id.button9:
                    cal.input(9);
                    break;
                case R.id.buttonA:
                    cal.add();
                    break;
                case R.id.buttonS:
                    cal.subtract();
                    break;
                case R.id.buttonX:
                    cal.multiply();
                    break;
                case R.id.buttonD:
                    cal.divide();
                    break;
                case R.id.buttonAC:
                    cal.reset();
                    break;
                case R.id.buttonE:
                    cal.equal();
                    break;

            }
            TextView textView = (TextView) findViewById(R.id.my_text);
            textView.setText(cal.test());

        }
    };



