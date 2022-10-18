package com.rakuten.swap;

public class Swaping2 {
public static void main(String[] args) {
	int num1 = 45;
	int num2 = 89;
	System.out.println("num1 =" + num1);
	System.out.println("num2 =" + num2);
	num1 = num1+num2;
	num2 = num1-num2;
	num1 = num1-num2;
	System.out.println("num1 =" + num1);
	System.out.println("num2 =" + num2);
	}
}
