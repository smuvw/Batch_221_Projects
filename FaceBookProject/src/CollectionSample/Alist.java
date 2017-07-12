package CollectionSample;

import java.util.ArrayList;

public class Alist {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList(20);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(null);
		al.add("sri");
		al.add(true);
		al.add(10.25f);
	
		
		System.out.println(al);
		System.out.println(al.get(3));
		al.add(3, "test");
		System.out.println(al);
		
		ArrayList<Integer> a= new ArrayList<Integer>(20);
		//a.add("sri");
		a.add(10);
		
	}

}
