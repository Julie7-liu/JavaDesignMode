package com.design.mode.decorator;

public class Decorator extends Component{

	protected Component component;
	
	public void SetComponent(Component component)
	{
		this.component=component;//����Component
	}
	//��дOperation(),ʵ��ִ�е���Component��Operation()
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
if(component!=null)
{
	component.Operation();
}
	}

}
