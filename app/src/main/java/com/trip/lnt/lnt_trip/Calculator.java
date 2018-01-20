package com.trip.lnt.lnt_trip;

/**
 * Created by Luong on 12/9/2017.
 */

enum Op {
    NONE,
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
}

class Calculator {
    private double mResult;

    Calculator() {
        mResult = 0.0;
    }

    void add(double val) {
        mResult += val;
    }

    void subtract(double val) {
        mResult -= val;
    }

    void multiply(double val) {
        mResult *= val;
    }

    void divide(double val) {
        mResult /= val;
    }

    void reset() {
        mResult = 0.0;
    }

    void reset(double val) {
        mResult = val;
    }

    /**
     * This is just an example of using variable arguments.
     * Currently we only use 1 argument, but we can have
     * multiple arguments in a method. This is to show that
     * we can do that.
     */
    void eval(Op operation, double ... val) {
        switch (operation) {
            case ADD:
                add(val[0]);
                break;
            case SUBTRACT:
                subtract(val[0]);
                break;
            case MULTIPLY:
                multiply(val[0]);
                break;
            case DIVIDE:
                divide(val[0]);
                break;
            default:
                break;
        }
    }

    double getResult() {
        return mResult;
    }
}
