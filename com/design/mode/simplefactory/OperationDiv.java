package com.design.mode.simplefactory;

/**
 * Created by 000294 on 2017/7/18.
 */
public class OperationDiv extends Operation {
    public double GetResult() throws Exception {
        double result=0;
        if(get_numberB()==0)
        {throw new Exception("除数不能为0.");}
        return get_numberA()/get_numberB();
    }
}
