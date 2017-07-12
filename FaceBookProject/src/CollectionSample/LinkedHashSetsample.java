package CollectionSample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetsample {

	public static void main(String[] args) {
		
		
		LinkedHashSet l= new LinkedHashSet();
		l.add(10);
		l.add(null);
		l.add("sri");
		l.add(10);
		System.out.println(l);
		
		Iterator j=l.iterator();
		
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	}

}
