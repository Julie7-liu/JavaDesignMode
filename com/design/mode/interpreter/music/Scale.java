package com.design.mode.interpreter.music;

public class Scale extends Expression {

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale = "";
		switch ((int)value) {
		case 1:
			scale = "����";
			break;
		case 2:
			scale = "����";
			break;
		case 3:
			scale = "����";
			break;
		}
		System.out.println(scale);

	}

}
