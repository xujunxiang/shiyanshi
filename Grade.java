package com.xjx.java;

import java.util.Scanner;
public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,gra=0,g;
		int a=0,b=0,c=0,d=0;
		for(i=0;i<10;i++)
		{
			Scanner in =new Scanner(System.in);
			g=in.nextInt();
		
			if(g<=100&&g>90)
				gra='A';
			if(g<=90&&g>80)
				gra='B';
			if(g<=80&&g>=60)
				gra='C';
			if(g<60)
				gra='D';
			switch(gra){
				case 'A':
				a++;
				break;
				case 'B':
				b++;
				break;
				case 'C':
				c++;
				break;
				case 'D':
				d++;
				break;
			}
		}
			System.out.println("优秀"+a+",良好"+b+",及格"+c+",不及格"+d);
		
		
	}

}
