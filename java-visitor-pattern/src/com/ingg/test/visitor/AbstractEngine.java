package com.ingg.test.visitor;

import com.ingg.visitor2.Camshaft;
import com.ingg.visitor2.EngineVisitor;
import com.ingg.visitor2.Piston;
import com.ingg.visitor2.SparkPlug;
import com.ingg.visitor2.Wheels;

public class AbstractEngine implements Engine {

	private int size;
	
	private boolean turbo;
	
	private Camshaft camshaft;
	private Piston piston;
	private SparkPlug[] sparkPlugs;

	private Wheels wheels;

	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
		this.camshaft = new Camshaft();
		this.piston = new Piston();
		this.wheels = new Wheels();
		this.sparkPlugs = new SparkPlug[]{new SparkPlug(), new SparkPlug()};
	}

	@Override
	public int getSize() {
		return size;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isTurbo() {
		return turbo;
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptEngineVisitor(EngineVisitor engineInterfaceVisitor) {
		
		camshaft.acceptEngineVisitor(engineInterfaceVisitor);
		piston.acceptEngineVisitor(engineInterfaceVisitor);
		wheels.acceptEngineVisitor(engineInterfaceVisitor);
		//loop over sparkplugs
		
		engineInterfaceVisitor.visit(this);
		
		
	}

}
