package com.design.mode.state.workdemo;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 21) {
			System.out.printf("��ǰʱ�䣺%s�� �Ӱ�Ŷ��ƣ������\n", w.getHour());
		}
		else
		{
			w.SetState(new SleepingState());
			w.WriteProgram();
		}
	}

}
