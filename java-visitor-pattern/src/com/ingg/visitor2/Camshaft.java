package com.ingg.visitor2;

public class Camshaft implements Visitable {

	@Override
	public void acceptEngineVisitor(
			EngineVisitor engineInterfaceVisitor) {

		engineInterfaceVisitor.visit(this);

	}

}
