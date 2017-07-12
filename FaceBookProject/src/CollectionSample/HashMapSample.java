package CollectionSample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		
		HashMap h= new HashMap();
		
		h.put(1, "sri");
		h.put(2, "sam");
		h.put(6, 50);
		h.put(3, "Sri");
		h.put(4, 10);
		h.put(5, 20);
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		
		Set i=h.entrySet();
	
		Iterator  itr=i.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry j=(Map.Entry)itr.next();
			
			System.out.println(j.getKey() +"***********"+j.getValue());
		
			
		}
	  
		

	}

}
