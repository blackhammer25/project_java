package jUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addString {

	@Test
	void test() {
		jUnitTesting str =new jUnitTesting();
		String a= str.addstr("ore wa anata no ","ski des" );
		assertEquals ("ore wa anata no ski des",a);
	}

}
