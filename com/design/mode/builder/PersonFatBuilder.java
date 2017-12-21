package com.design.mode.builder;

import java.awt.Graphics;
import java.awt.Panel;

public class PersonFatBuilder extends PersonBuilder {

	public PersonFatBuilder(Graphics g, Panel p) {
		super(g, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void BuildHead() {
		// TODO Auto-generated method stub
        g.drawRoundRect(0, 0, 50, 20, 30, 30);
	}

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		g.drawRoundRect(0, 0, 60, 50, 10, 50);
	}

	@Override
	public void BuildArmLeft() {
		// TODO Auto-generated method stub
		g.drawLine(60, 50, 40, 100);
	}

	@Override
	public void BuildArmRight() {
		// TODO Auto-generated method stub
		g.drawLine(70, 50, 90, 100);
	}

	@Override
	public void BuildLegLeft() {
		// TODO Auto-generated method stub
		g.drawLine(60, 100, 45, 150);
	}

	@Override
	public void BuildLegRight() {
		// TODO Auto-generated method stub
		g.drawLine(70, 100, 85, 150);
	}

}
