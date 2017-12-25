package com.design.mode.simplefactory;

/**
 * Created by 000294 on 2017/7/18.
 */
public class OperationSub extends Operation {
    public double GetResult()
    {
        double result=0;
        result=get_numberA()-get_numberB();
        return result;
    }
}
