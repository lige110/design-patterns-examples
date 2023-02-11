package org.patterns.creational.factories.abstractFactory;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}
