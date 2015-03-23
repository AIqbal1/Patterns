package com.iavaab.visitor2;

import com.iavaab.test.visitor.Engine;

public class EngineDiagnostics implements EngineVisitor {

	@Override
	public void visit(Camshaft camshaft) {
		System.out.println("Camshaft OKAY!");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("engine OKAY!");		
	}

	@Override
	public void visit(Piston piston) {
		System.out.println("Piston OKAY!");
	}

	@Override
	public void visit(SparkPlug sparkPlug) {
		System.out.println("SparkPlug OKAY!");
	}

	@Override
	public void visit(Wheels wheels) {
		System.out.println("Wheels are okay");
	}
	
	

}
