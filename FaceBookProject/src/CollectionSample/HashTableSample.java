package CollectionSample;

import java.util.Hashtable;

public class HashTableSample {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		h.put(1, "sri");
		h.put(2, 10);
		//h.put(3, null);
		System.out.println(h);
		
		Hashtable<Integer,String> h1= new Hashtable<Integer,String>();
		h1.put(1, "sri");
		h1.put(2, "Sam");
		h1.put(3, "priya");
		System.out.println(h1);
		

	}

}
