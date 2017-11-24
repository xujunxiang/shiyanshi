package com.xjx.week10;

import java.util.Random;
import java.util.Scanner;

public class Choujiang {
	public static void main(String[] args) {
		String[] a=new String[] {"iPhone8","xBox","Lenovo","BMW"};
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		int n;
		for (int i=0;i<a.length;i++){
			n=r.nextInt(a.length);
			int s=in.nextInt();
			while(true){
				if (a[n]=="000")
				{
					n=r.nextInt(a.length);
				}
				else
					break;
			}
			System.out.println(a[n]);
			a[n]="000";
		}
	}
}
