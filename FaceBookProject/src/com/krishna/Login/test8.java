package com.krishna.Login;

public class test8 {
	
	int no=10;
	
	public  String[] course= new String[4];
	
	
	public static int m1(int a){
		System.out.println(a*2);
		return a;
	}
	
	public static void m2(int[] a){
		
		System.out.println(a.length);
		
		for (int a1:a){
			System.out.println(a1);
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int [] b= {10,20,30};
		
		test8.m2(b);
		
		int [][] c= new int[2][2];
		c[0][0]=10;
		c[0][1]=20;
		c[1][0]=21;
		c[1][1]=22;
		System.out.println(c[0][0]);

	}

}
