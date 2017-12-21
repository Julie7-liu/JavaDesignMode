package com.design.mode.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

private List<Component> children=new ArrayList<Component>();
	@Override
	public void Add(Component c) {
		// TODO Auto-generated method stub
children.add(c);
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println((new StringUtil('-',depth).getValue())+name);
		for(Component com: children)
		{
			com.Display(depth+2);
		}
	}

}
