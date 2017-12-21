/**
 * 
 */
/**
 * @author 000294
 *
 */
package com.design.mode.dependenceinversionprinciple;

public class HandaCar implements ICar {

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("本田开始启动了");
	}

	@Override
	public void Trun() {
		// TODO Auto-generated method stub
		System.out.println("本田开始转弯了");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("本田开始停车了");
	}

}