package com.lilong.util;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	// 方法1:返回min-max的随机整数(包含min,max)
	public static int randomint(int min, int max) {
		Random r = new Random();
		int i = r.nextInt(max - min + 1) + min;
		return i;
	}
	// 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	public static String subRandom(int min, int max, int subs) {
		int[] x = new int[subs];// 声明数组用来存放结果值
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() != subs) {
			set.add(randomint(min, max));
		}
		int i = 0;
		for (Integer integer : set) { // 把set集合放入数组中
			x[i] = integer;
			i++;
		}
		String aa="[";
		for (Integer ii : x) {
			aa+=ii+",";		
			}
		String string = aa.substring(0,aa.length()-1);
		string+="]";
		return string;
	}
	// 方法3：返回一个随机的字符(0-9a-zA-Z)
	public static char randomCharacter() {
		String str = "123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		return str.charAt(randomint(0, str.length() - 1));
	}
	// 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		return str;
	}
}
