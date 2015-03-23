package com.ingg.visitor2;

import com.ingg.test.visitor.Engine;

public interface EngineVisitor {

	void visit(Camshaft camshaft);
	void visit(Engine engine);
	void visit(Piston piston);
	void visit(SparkPlug sparkPlug);
	void visit(Wheels wheels);
}
