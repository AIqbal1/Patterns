package com.iavaab.visitor2;

public class Piston implements Visitable {

	@Override
	public void acceptEngineVisitor(
			EngineVisitor engineInterfaceVisitor) {
		
		engineInterfaceVisitor.visit(this);

	}

}
