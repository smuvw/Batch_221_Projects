package CollectionSample;

import java.util.ArrayList;
import java.util.LinkedList;

public class LList {
	
	
	public static void getData(){
		
		LinkedList l= new LinkedList();
		l.add(10);
		l.add("sri");
		//System.out.println(l);
		//l.get(2);
		
		System.out.println(l.get(1));
		
		ArrayList a= new ArrayList(l);
		System.out.println(a);
		a.add(30);
		System.out.println(a);
		
	}
	
	public static LinkedList m1(){
		
		LinkedList l= new LinkedList();
		l.add(10);
		l.add("sri");
		 return l;		
		
	}

	public static void main(String[] args) {
		
         LList.getData();
        LinkedList i=LList.m1();
        
        System.out.println(i.size());
        System.out.println(i.get(1));
	}

}
