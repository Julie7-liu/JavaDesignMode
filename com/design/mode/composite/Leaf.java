package com.design.mode.composite;
 

public class Leaf extends Component {

	public Leaf(String name) {super(name);}
	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove to a leaf");
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println((new StringUtil('-',depth).getValue())+name);
	}

}
