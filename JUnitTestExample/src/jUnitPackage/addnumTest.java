package jUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class addnumTest {

	@Test
	void test() {
		jUnitTesting test = new jUnitTesting();
		int num =test.addnum(100, 458);
		assertEquals (558,num);
	}

}
