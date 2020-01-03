package com.lilong.util;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void test() throws UnsupportedEncodingException {
		List<String> readLine = StreamUtil.readLine(this.getClass().getResourceAsStream("/test.txt"));
		for (String string : readLine) {
			System.out.println(string);
		}
	}

}
