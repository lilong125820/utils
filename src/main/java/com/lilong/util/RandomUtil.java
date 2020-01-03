package com.lilong.util;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	// ����1:����min-max���������(����min,max)
	public static int randomint(int min, int max) {
		Random r = new Random();
		int i = r.nextInt(max - min + 1) + min;
		return i;
	}
	// ����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ���
	public static String subRandom(int min, int max, int subs) {
		int[] x = new int[subs];// ��������������Ž��ֵ
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() != subs) {
			set.add(randomint(min, max));
		}
		int i = 0;
		for (Integer integer : set) { // ��set���Ϸ���������
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
	// ����3������һ��������ַ�(0-9a-zA-Z)
	public static char randomCharacter() {
		String str = "123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		return str.charAt(randomint(0, str.length() - 1));
	}
	// ����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		return str;
	}
}
