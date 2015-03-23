package com.ingg.test.visitor;

import com.ingg.visitor2.Visitable;

public interface Engine extends Visitable {
	
	int getSize();
	boolean isTurbo();

}
