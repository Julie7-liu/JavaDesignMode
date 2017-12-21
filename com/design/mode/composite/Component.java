package com.design.mode.composite;
//����еĶ��������ӿڣ����ʵ�����£�ʵ�������๫�нӿڵ�Ĭ����Ϊ������һ���ӿ����ڷ��ʺ͹���Component���Ӳ���
public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void Add(Component c);

	public abstract void Remove(Component c);

	public abstract void Display(int depth);
}
