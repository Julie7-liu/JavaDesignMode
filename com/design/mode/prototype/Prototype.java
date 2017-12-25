/**
 * 
 */
/**
 * @author 000294
 * ԭ����
 */
package com.design.mode.prototype;

abstract class Prototype implements Cloneable
{
	private String id;
	
	public String getId() {
		return id;
	}

	public Prototype(String id)
	{
		this.id=id;
	}
	//������ؼ�����������һ��Clone����
	public abstract Prototype Clone() throws CloneNotSupportedException;
}