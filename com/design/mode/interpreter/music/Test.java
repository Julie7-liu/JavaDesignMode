package com.design.mode.interpreter.music;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayContext context = new PlayContext();
		// 音乐-上海滩
		System.out.println("上海滩:");
		context.setText("O 2 E 0.5 G 0.5 O 2 E 0.5 G 0.5");
		Expression expression = null;
		while (context.getText().length() > 0) {
			String str = context.getText().substring(0, 1);
			switch (str) {
			case "O":
				expression = new Scale();
				break;
			case "C":
			case "D":
			case "E":
			case "F":
			case "G":
			case "A":
			case "B":
			case "P":
				expression = new Note();
				break;
			}
			expression.Interpret(context);
		}
	}

}
