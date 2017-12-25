package com.design.mode.state.workdemo;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		// TODO Auto-generated method stub
		if (w.getHour() < 12) {
			System.out.printf("当前时间：%s点 上午工作，精神百倍 \n", w.getHour());
		}
		else
		{
			w.SetState(new NoonState());
			w.WriteProgram();
		}
	}

}
