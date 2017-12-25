package com.design.mode.simplefactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper;
		oper= OperationFactory.createOperation('+');
		oper.set_numberA(1);
		oper.set_numberB(2);
		 double result = 0;
        try {
            result = oper.GetResult();
        }
        catch (Exception ex)
        {System.out.print(ex.getMessage());}
        System.out.print(result);
	}

}
