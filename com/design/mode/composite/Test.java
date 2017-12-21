package com.design.mode.composite;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite root = new Composite("root");
		root.Add(new Leaf("Leaf A"));
		root.Add(new Leaf("Leaf B"));
		Composite comp = new Composite("Composite X");
		comp.Add(new Leaf("Leaf XA"));
		comp.Add(new Leaf("Leaf XB"));
		
		Composite comp2 = new Composite("Composite XY");
		comp2.Add(new Leaf("Leaf XYA"));
		comp2.Add(new Leaf("Leaf XYB"));
		
		comp.Add(comp2);
		
		root.Add(comp);
		root.Add(new Leaf("Leaf C"));
		
		Leaf leaf=new Leaf("Leaf D");
		root.Add(leaf);
		root.Remove(leaf);
		
		root.Display(1);
		
	}

}
