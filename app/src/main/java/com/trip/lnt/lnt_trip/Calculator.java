package com.trip.lnt.lnt_trip;


import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Luong on 12/9/2017.
 */

public class Calculator {

    long result = 0;
    long result1 = 0;
    int order = 0;
    int swap = 0;
    int opperation = 0; //0 for idle, 1 for add, 2 for subtract, 3 for multiply, 4 for divide

    public void input(int num1)  {
        if (order == 0)
        result = result*10 + num1;
        else
        {result1 = result1*10 + num1;
        swap = 1;
    }
    }

    public void add ()
    { equal();
      order = 1;
      opperation = 1;
    }

    public void subtract ()
    { equal();
      order = 1;
      opperation = 2;
    }

    public void multiply ()
    { equal();
      order = 1;
      opperation = 3;
    }

    public void divide ()
    { equal();
      order = 1;
      opperation = 4;
    }

    public void reset ()
    {
        result = 0;
        result1 = 0;
        order = 0;
        opperation = 0;
    }

    public void equal ()
    {
        if (opperation == 1)
        {
            result = result + result1;
        }
        else if (opperation == 2)
        {
            result = result - result1;
        }
        else if (opperation == 3)
        {
            result = result * result1;
        }
        else if (opperation == 4)
        {
            result = result / result1;
        }
        result1 = 0;
        opperation = 0;
        order = 0;
        swap = 0;
    }


    public String test() {
        String view;
        if (swap == 0)
            view = Long.toString(result);
        else
            view = Long.toString(result1);
        return view;
    }

}
