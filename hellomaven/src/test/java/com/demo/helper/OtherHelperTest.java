package com.demo.helper;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.demo.junit.HelloJunit;
import java.util.*;
public class OtherHelperTest {
	OtherHelper helper = new OtherHelper();
	@Test
	public void testIsNull() {
		boolean flag = helper.isNull("Hello", "World",1,2,3, false);
		assertEquals(false, flag);
	}
	@Test
	public void testIsNull2() {
		boolean flag = helper.isNull();
		assertEquals(true, flag);
	}
	@Test
	public void testReadPassword() {
		String pwd = helper.readPassword("Welcome", new Scanner(System.in)); 
		assertEquals("User123", pwd);
	}

	@Test
		public void testDescrambleString() {
		String s =helper.descrambleString("102,100");
		assertEquals("ca",s);
	}
}
