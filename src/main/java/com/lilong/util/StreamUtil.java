package com.lilong.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	/**
	 * @Title: readLine
	 * @Description: ¶ÁÈ¡ÎÄ¼þ
	 * @param ins
	 * @return
	 * @return: List<String>
	 * @throws UnsupportedEncodingException 
	 */
	public static List<String> readLine(InputStream in) throws UnsupportedEncodingException {
		List<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in,"utf-8"));
		String str = null;
		try {
			while ((str = reader.readLine()) != null) {
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
