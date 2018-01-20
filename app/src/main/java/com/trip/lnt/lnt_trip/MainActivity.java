package com.trip.lnt.lnt_trip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Calculator mCal;
    private Op mPrevOp;
    private double mInput;

    public void opBtnOnClick(View v) {
        TextView output = findViewById(R.id.my_text); //number display

        if (mPrevOp == Op.NONE)
            mCal.reset(mInput);

        switch (v.getId()) {
            case R.id.buttonA:
                if (mPrevOp != Op.NONE)
                    mCal.add(mInput);

                output.setText(Double.toString(mCal.getResult()));
                mPrevOp = Op.ADD;
                mInput = 0.0;
                break;
            case R.id.buttonS:
                if (mPrevOp != Op.NONE)
                    mCal.subtract(mInput);

                output.setText(Double.toString(mCal.getResult()));
                mPrevOp = Op.SUBTRACT;
                mInput = 0.0;
                break;
            case R.id.buttonX:
                if (mPrevOp != Op.NONE)
                    mCal.multiply(mInput);

                output.setText(Double.toString(mCal.getResult()));
                mInput = 0.0;
                mPrevOp = Op.MULTIPLY;
                break;
            case R.id.buttonD:
                if (mPrevOp != Op.NONE)
                    mCal.divide(mInput);

                output.setText(Double.toString(mCal.getResult()));
                mPrevOp = Op.DIVIDE;
                mInput = 0.0;
                break;
            case R.id.buttonAC:
                mCal.reset();
                mInput = 0.0;
                mPrevOp = Op.NONE;
                output.setText(Double.toString(mInput));
                break;
            case R.id.buttonE:
                mCal.eval(mPrevOp, mInput);
                mInput = mCal.getResult();
                mPrevOp = Op.NONE;
                output.setText(Double.toString(mInput));
                break;
            default:
                break;
        }
    }

    public void numBtnOnClick(View v) {
        TextView output = findViewById(R.id.my_text); //number display
        int num;

        switch (v.getId()) {
            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
                Button btn = (Button) v;
                num = Integer.parseInt(btn.getText().toString());

                mInput *= 10;
                mInput += num;
                output.setText(Double.toString(mInput));
                break;
            default:
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = findViewById(R.id.my_text); //number display
        mCal = new Calculator();
        mInput = 0.0;
        mPrevOp = Op.NONE;

        output.setText("0.0");
    }
}
