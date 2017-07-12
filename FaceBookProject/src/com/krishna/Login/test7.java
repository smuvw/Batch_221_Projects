package com.krishna.Login;

public class test7 {

	public static void main(String[] args) {
		
		int no=10; //variable
		
		int[] a= new int[5]; //Array
		//int[] a1= {1,2,3,100}; //Array
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=15;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	
		String[] b= {"selenium","Java"};
		
		System.out.println(b.length);
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		Object[] j= new Object[5];
		j[0]=19;
		j[1]="sri";
		j[2]=10.23;
		j[3]='A';
		j[4]=10.2345;
		for(int k=0;k<j.length;k++){
			System.out.println(j[k]);
		}
		
 		
	}

}
