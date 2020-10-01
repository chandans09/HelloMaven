package com.demo.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.demo.helper.DemoHelper;

public class StringHelperTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testwordWrap() {
			String str="My name is Xyz, I am from kolkata";
			String actual="My \r\n" + "name \r\n" + "is \r\n" + "Xyz, \r\n" + "I am \r\n" + 
					"from \r\n" + "kolkata \r\n";
			int i=4;
			String result=new StringHelper().wordWrap(str,i);
			assertEquals(actual,result);
}
	@Test
		public void testShortenString() {
				String str="My name is Xyz, I am from kolkata";
				String actual="My name is Xyz, I am from kolkata";
				int i=38;
				double d=0.5;
				String result=new StringHelper().shortenString(str,i,d);
				assertEquals(actual,result);
	}
	@Test
	public void testrepeatString() {
			String str="kolkata";
			int i=2;
			String result=new StringHelper().repeatString(str,i);
			assertEquals("kolkatakolkata",result);
}
	@Test
	public void testreplaceInString() {
			String str="kolkata";
			String str2="Mumbai";
			String str3="I leave in kolkata";
			String result=new StringHelper().replaceInString(str3,str2,str);
			assertEquals("I leave in Mumbai",result);
}

	@Test
	public void testisEmpty() {
			String str="kolkata";
			boolean result=new StringHelper().isEmpty(str);
			assertEquals(false,result);
}
	@Test
	public void testisEmptyT() {
			String str="";
			boolean result=new StringHelper().isEmpty(str);
			assertEquals(true,result);
}
	@Test
	public void testinsertIntoString() {
			String result=new StringHelper().insertIntoString("1234", "a", "", "c", "+", "-", "32342");
			assertEquals("a12c3+4",result);
}
}
