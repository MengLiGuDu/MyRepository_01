package com.action;

import com.tool.Utils;

/*
 * ��ͨJava���̴����jar���õ�����ʹ�ã�package engineering.jar��
 */
public class UserAction {
	public static void main(String[] args) {
		Utils u = new Utils();
		String string = u.GetString();
		System.out.println("string="+string);
		boolean b = u.GetBoolean(string);
		System.out.println("b="+b);
	}
}
