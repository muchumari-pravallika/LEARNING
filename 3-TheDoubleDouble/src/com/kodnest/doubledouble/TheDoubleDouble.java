package com.kodnest.doubledouble;

import java.util.Scanner;

public class TheDoubleDouble {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		scan.close();
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
