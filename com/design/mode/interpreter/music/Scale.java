package com.design.mode.interpreter.music;

public class Scale extends Expression {

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale = "";
		switch ((int)value) {
		case 1:
			scale = "µÕ“Ù";
			break;
		case 2:
			scale = "÷–“Ù";
			break;
		case 3:
			scale = "∏ﬂ“Ù";
			break;
		}
		System.out.println(scale);

	}

}
