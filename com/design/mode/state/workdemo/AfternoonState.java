package com.design.mode.state.workdemo;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 17) {
			System.out.printf("当前时间：%s点 下午状态不错，继续努力\n", w.getHour());
		}
		else
		{
			w.SetState(new EveningState());
			w.WriteProgram();
		}
	}

}
