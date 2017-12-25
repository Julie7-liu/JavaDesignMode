package com.design.mode.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NoterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for(AbstractExpression exp:list)
		{
			exp.Interpret(context);
		}
	}

}
