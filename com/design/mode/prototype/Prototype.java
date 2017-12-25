/**
 * 
 */
/**
 * @author 000294
 * 原型类
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
	//抽象类关键就是有这样一个Clone方法
	public abstract Prototype Clone() throws CloneNotSupportedException;
}