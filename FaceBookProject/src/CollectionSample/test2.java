package CollectionSample;

public class test2 {

	public static void main(String[] args) {
		
		String s1="sri";
		String s2= "Ram";
		String s3="sri";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		StringBuffer s= new  StringBuffer();
		
		s.append("sri");
		s.append("same");
		System.out.println(s);
		
	}

}
