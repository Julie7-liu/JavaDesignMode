package com.design.mode.state.workdemo;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 17) {
			System.out.printf("��ǰʱ�䣺%s�� ����״̬��������Ŭ��\n", w.getHour());
		}
		else
		{
			w.SetState(new EveningState());
			w.WriteProgram();
		}
	}

}
