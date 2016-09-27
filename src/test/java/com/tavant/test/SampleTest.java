package com.tavant.test;

import junit.framework.TestCase;

public class SampleTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testDummy()
	{
		assertEquals("1", "1");
	}
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
