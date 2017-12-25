package com.design.mode.state.workdemo;

public class Work {
	private State current;

	public Work() {
		current = new ForenoonState();
	}

	private double hour;

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	private boolean finish = false;

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void SetState(State s) {
		current = s;
	}

	public void WriteProgram() {
		current.WriteProgram(this);
	}
}
