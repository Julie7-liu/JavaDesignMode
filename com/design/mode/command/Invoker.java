package com.design.mode.command;

//要求该命令执行这个请求
public class Invoker {
	private Command command;

	public void SetCommand(Command command) {
		this.command = command;
	}

	public void ExecuteCommand() {
		command.Execute();
	}
}
