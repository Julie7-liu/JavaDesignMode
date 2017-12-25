package com.design.mode.publicsubscribe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConcreteSubject s=new ConcreteSubject();
        s.Attach(new ConcreteObserver(s,"X"));
        s.Attach(new ConcreteObserver(s,"Y"));
        s.Attach(new ConcreteObserver(s,"Z"));
        
        s.setSubjectState("ABC");
        s.Notify();
	}

}
