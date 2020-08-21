package com.vaescode.springboot.app.bean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyTests {

	@Test
	@DisplayName("Multiplicar")
	public void multiplicarPorCero() {
		Feature f = new Feature();
		assertEquals(0,f.multiplicar(10, 0)," 10 x 0 = 0");
		assertEquals(1,f.multiplicar(10, 0)," 10 x 0 = 0");
		assertEquals(10,f.multiplicar(10, 1)," 10 x 1 = 10");
		
	}
	
	@Test
	@DisplayName("Test Boolean")
	public void multiplicarIsNull() {
		Feature f = new Feature();
		assertTrue(f.isNull(f.multiplicar(10, 0)),"true");
		assertFalse(f.isNull(f.multiplicar(11, 1)),"false");
		
	}
	
}
