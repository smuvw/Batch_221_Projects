package CollectionSample;

import java.util.LinkedHashMap;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		
		LinkedHashMap l= new LinkedHashMap();
		
		l.put(1, "sri");
		l.put(2, "sam");
		l.put(5, 20);
		l.put(3, "Sri");
		l.put(4, 10);
		System.out.println(l);
		System.out.println(l.keySet());
		System.out.println(l.values());

	}

}
