package com.design.mode.state.workdemo;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 12) {
			System.out.printf("��ǰʱ�䣺%s�� ���繤��������ٱ� \n", w.getHour());
		}
		else
		{
			w.SetState(new NoonState());
			w.WriteProgram();
		}
	}

}
