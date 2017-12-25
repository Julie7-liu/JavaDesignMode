package com.design.mode.memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Originator o=new Originator();
       o.setState("On");
       o.Show();
       
       Caretaker c=new Caretaker();
       c.setMemento(o.CreateMemento());
       
       o.setState("Off");
       o.Show();
       
       o.SetMemento(c.getMemento());
       o.Show();
       
	}

}
