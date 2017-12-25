package com.design.mode.state.workdemo;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 13) {
			System.out.printf("��ǰʱ�䣺%s�� ���ˣ��緹������������\n", w.getHour());
		}
		else
		{
			w.SetState(new AfternoonState());
			w.WriteProgram();
		}
	}

}
