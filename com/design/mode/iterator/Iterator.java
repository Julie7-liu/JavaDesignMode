package com.design.mode.iterator;

public abstract class Iterator {
	public abstract Object First();

	public abstract Object Next();

	public abstract Boolean IsDone();

	public abstract Object CurrentItem();
}
