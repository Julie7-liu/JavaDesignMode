package com.design.mode.state.workdemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Work emergencyproject=new Work();
emergencyproject.setHour(9);
emergencyproject.WriteProgram();

emergencyproject.setHour(10);
emergencyproject.WriteProgram();

emergencyproject.setHour(12);
emergencyproject.WriteProgram();

emergencyproject.setHour(13);
emergencyproject.WriteProgram();

emergencyproject.setHour(14);
emergencyproject.WriteProgram();

emergencyproject.setHour(17);
emergencyproject.setFinish(false);
emergencyproject.WriteProgram();

emergencyproject.setHour(19);
emergencyproject.WriteProgram();

emergencyproject.setHour(22);
emergencyproject.WriteProgram();
	}

}
