package org.patterns.creational.factories.abstractFactory;

public abstract class DaoAbstractFactory {

	public abstract Dao createDao(String type);
}
