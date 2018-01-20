package com.trip.lnt.lnt_trip;


import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Luong on 12/9/2017.
 */

public class Calculator {
    double result = 0; //the first number
    double result1 = 0; //the second number
    int order = 0; //currently set input,  number 0 for result or 1 for result1
    int swap = 0; //currently display result or result1
    int opperation = 0; //0 for idle, 1 for add, 2 for subtract, 3 for multiply, 4 for divide

    public void input(int num1) {
    if (order == 0) {
        result = result * 10 + num1; //input for result
    }
    else {
        result1 = result1*10 + num1; //input for result1
        swap = 1;
    }
    }

    public void add () {
        equal(); //finish the application before the next one
        order = 1;  //switch to display result1 for user input
        opperation = 1; //add
    }

    public void subtract () {
        equal();
        order = 1; //switch to display result1 for user input
        opperation = 2; //subtract
    }

    public void multiply () {
        equal(); //finish the application before the next one
        order = 1; //switch to display result1 for user input
        opperation = 3; //multiply
    }

    public void divide () {
        equal(); //finish the application before the next one
        order = 1; //switch to display result1 for user input
        opperation = 4; //divide
    }

    public void reset () {
        result = 0; // clear result
        result1 = 0; // clear result2
        order = 0;  //set to display result
        opperation = 0; //no operation set
    }

    public void equal () {
        if (opperation == 1) {
            result = result + result1; //add two of the number and set the result to number 1
        }
        else if (opperation == 2) {
            result = result - result1; //number 1 subtract number 2 and set the result to number 1
        }
        else if (opperation == 3) {
            result = result * result1; //multiply two of the number and set the result to number 1
        }
        else if (opperation == 4) {
            result = result / result1; //number 1 divide number 2 and set the result to number 1
        }
        result1 = 0; //after the application complete, clear number 2 for new user input
        opperation = 0; //opperation set to none
        order = 0; //set to input for number 1
        swap = 0; //display numner 1
    }


    public String test() {
        String view;
        if (swap == 0)
            view = Double.toString(result); //display number 1
        else
            view = Double.toString(result1); // display number 2
        return view;
    }
}
