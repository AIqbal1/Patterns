package com.iavaab.visitor2;

import com.iavaab.test.visitor.Engine;
import com.iavaab.test.visitor.StandardEngine;

public class MainMethod {

	public static void main(String args[]) {
		Engine engine = new StandardEngine(2, true);
		
		engine.acceptEngineVisitor(new EngineDiagnostics());
	}
	
}
