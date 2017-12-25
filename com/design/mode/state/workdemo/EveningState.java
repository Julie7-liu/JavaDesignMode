package com.design.mode.state.workdemo;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 21) {
			System.out.printf("当前时间：%s点 加班哦，疲惫至极\n", w.getHour());
		}
		else
		{
			w.SetState(new SleepingState());
			w.WriteProgram();
		}
	}

}
