package com.design.mode.simplefactory;

/**
 * Created by 000294 on 2017/7/18.
 */
public class Operation {
    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    private double _numberA=0;

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    private double _numberB=0;

    public double GetResult() throws Exception {
        double result=0;
        return result;
    }
}
