package com.ingg.visitor2;

import com.ingg.test.visitor.Engine;
import com.ingg.test.visitor.StandardEngine;

public class MainMethod {

	public static void main(String args[]) {
		Engine engine = new StandardEngine(2, true);
		
		engine.acceptEngineVisitor(new EngineDiagnostics());
	}
	
}
