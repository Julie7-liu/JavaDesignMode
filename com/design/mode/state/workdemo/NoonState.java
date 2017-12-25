package com.design.mode.state.workdemo;

public class NoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 13) {
			System.out.printf("当前时间：%s点 饿了，午饭：犯困，午休\n", w.getHour());
		}
		else
		{
			w.SetState(new AfternoonState());
			w.WriteProgram();
		}
	}

}
