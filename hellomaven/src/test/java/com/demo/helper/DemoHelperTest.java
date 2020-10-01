package com.demo.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.demo.junit.HelloJunit;

public class DemoHelperTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testdifferHelper() {
		DemoHelper DemoObject = DemoHelper.getInstance();
		int result = DemoObject.differHelper(1,2);

		assertEquals(1,result);
	}


}
