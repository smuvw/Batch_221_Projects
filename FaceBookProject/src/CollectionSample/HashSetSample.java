package CollectionSample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
	

	public static void main(String[] args) {
	test1 t1= new test1();
		
   HashSet h= new HashSet(25);
   
   h.add(10);
   h.add(null);
   h.add("Sri");
   h.add(20);
   h.add(10);
   h.add(t1);
   
   System.out.println(h);
   
  Iterator i=h.iterator();
  
  System.out.println(i.hasNext());
   
  System.out.println(i.next());
  System.out.println(i.next());
  System.out.println(i.next());
  System.out.println(i.next());
  System.out.println(i.next());
  //System.out.println(i.next());
	}

}
