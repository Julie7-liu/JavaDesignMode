package com.design.mode.simplefactory;

/**
 * Created by 000294 on 2017/7/18.
 */
public class OperationFactory {
    public static Operation createOperation(char operate)
    {
        Operation oper=null;
        switch (operate)
        {
            case '+':
                oper=new OperationAdd();
                break;
            case '-':
                oper=new OperationSub();
                break;
            case '*':
                oper=new OperationMul();
                break;
            case '/':
                oper=new OperationDiv();
                break;
        }
        return oper;
    }
}
