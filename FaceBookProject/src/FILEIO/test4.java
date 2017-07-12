package FILEIO;

public class test4 {

	public static void main(String[] args) {
		
		String s5="abc";
		String s6="test";
		String s7="abc";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		

		
		String s1= new String("sri");
		System.out.println(s1);
		
		s1.concat("muvva");
		System.out.println(s1);
		
		//String s2= new String("sri");
		//System.out.println(s2);
		
		StringBuffer s2= new StringBuffer("sam");
		System.out.println(s2);
		s2.append("R");
		System.out.println(s2);

	}

}
