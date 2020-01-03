package com.lilong.util;

public class NumberUtil {
	/**
	 * @Title: isNumber
	 * @Description: ÅĞ¶ÏÊÇ·ñÊÇÊı×Ö
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
}
