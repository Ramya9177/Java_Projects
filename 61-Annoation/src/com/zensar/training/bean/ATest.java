package com.zensar.training.bean;

import com.zensar.training.annotations.Model;
import com.zensar.training.annotations.TestDoubles;
import com.zensar.training.annotations.TestIntegers;

public class ATest {
	
	@TestIntegers(ints= {3,4,5,6,7})
	void test1() {
		
	}
	@TestDoubles(doubles= {3.4,5.6,7.8})
	void test2() {
		
	}
	void m3(@Model Employee e) {
		
	}

}
