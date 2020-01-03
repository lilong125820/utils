package com.lilong.util;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandomint() {
		for (int i = 0; i <5; i++) {
			int a = RandomUtil.randomint(0,3);
			System.out.println(a);
		}
	}
	@Test
	public void subRandom() {
		String is = RandomUtil.subRandom(1,5,3);
		System.out.println(is);
	}
	@Test 
	public void randomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	@Test 
	public void randomString() {
		String randomString = RandomUtil.randomString(5);
		System.out.println(randomString);
	}
}
