package com.ingg.visitor2;

public class SparkPlug  implements Visitable {

	@Override
	public void acceptEngineVisitor(
			EngineVisitor engineInterfaceVisitor) {
		// TODO Auto-generated method stub
		
		engineInterfaceVisitor.visit(this);

	}


}
