/**
 * 
 */
/**
 * @author 000294
 *
 */
package com.design.mode.builder;

import java.awt.Graphics;
import java.awt.Panel;

abstract class PersonBuilder
{
	protected Graphics g;
	protected Panel p;
	public PersonBuilder(Graphics g,Panel p)
	{
		this.g=g;
		this.p=p;
	}
	public abstract void BuildHead();
	public abstract void BuildBody();
	public abstract void BuildArmLeft();
	public abstract void BuildArmRight();
	public abstract void BuildLegLeft();
	public abstract void BuildLegRight();
}