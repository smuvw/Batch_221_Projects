package FILEIO;

import java.io.File;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("abc1.txt");
		
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.exists());
		
		File f1= new File("functionsFolder");
		f1.mkdirs();
		
		
		
		
	}

}
