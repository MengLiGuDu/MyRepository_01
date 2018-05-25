package com.test;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Test {
	public static void main(String[] args) throws Exception {
		String str = "123456";
		String str1 = getResult(str);
		System.out.println("MD5="+str1);
	}
	
	//SHA鍔犲瘑
	public static String getResult1(String inputStr){ 
		BigInteger bigInteger=null;
		try{
			MessageDigest md = MessageDigest.getInstance("SHA");
			byte[] inputData = inputStr.getBytes();
			md.update(inputData);
			bigInteger = new BigInteger(md.digest());
		}catch(Exception e){
			e.printStackTrace();
		}
		return bigInteger.toString(16);
	}
	
	//MD鍔犲瘑
	public static String getResult(String inputStr){ 
		BigInteger bigInteger=null;
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] inputData = inputStr.getBytes();
			md.update(inputData);
			bigInteger = new BigInteger(md.digest());
		}catch(Exception e){
			e.printStackTrace();
		}
		return bigInteger.toString(16);
	}
}
