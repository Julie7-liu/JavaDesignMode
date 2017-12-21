package com.design.mode.decorator;

public class Decorator extends Component{

	protected Component component;
	
	public void SetComponent(Component component)
	{
		this.component=component;//设置Component
	}
	//重写Operation(),实际执行的是Component的Operation()
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
if(component!=null)
{
	component.Operation();
}
	}

}
