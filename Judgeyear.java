package com.xjx.java;

import java.util.Scanner;
public class Judgeyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year=in.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
			System.out.println(year+"是闰年");
		else
			System.out.println(year+"不是闰年");
	}

}
