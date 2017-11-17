package com.xjx.java;

public class Leijiaqiuhe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n,i,j;
		for(i=1;i<=10;i++)
		{
			n=1;
			for(j=1;j<=i;j++)
			{
				n=n*j;
			}
			sum=sum+n;
		}
		System.out.println(sum);
	}

}
