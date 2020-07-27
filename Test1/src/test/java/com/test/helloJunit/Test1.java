package com.test.helloJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.hello.HelloWorld;

import junit.framework.Assert;

public class Test1 {

	@Test
	public void test() {
		HelloWorld h1 = new HelloWorld();
		int j = h1.test1();
		assertEquals(1, j);
		
	}

}
