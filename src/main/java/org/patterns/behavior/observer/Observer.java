package org.patterns.behavior.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
