package com.iavaab.test.visitor;

import com.iavaab.visitor2.Visitable;

public interface Engine extends Visitable {
	
	int getSize();
	boolean isTurbo();

}
