package com.design.mode.state.workdemo;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
			System.out.printf("��ǰʱ�䣺%s�� �����ˣ�˯����\n", w.getHour());
		 
	}

}
