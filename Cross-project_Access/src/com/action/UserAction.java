package com.action;

import com.tool.Utils;

/*
 * 普通Java工程打包成jar，该地引入使用（package engineering.jar）
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
