package FILEIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test3 {

	public static void main(String[] args) throws IOException {
		
		
		File f= new File("abc.txt");
		
	 FileReader fr= new FileReader(f);
	 BufferedReader br= new BufferedReader(fr);
	 
	String j= br.readLine();
	
	while(j!=null){
		System.out.println(j);
		j= br.readLine();
	}
	 
/*	int  i= fr.read();
	
	while(i!=-1) {
		System.out.println((char)i);
		i=fr.read();
	}*/

	}

}
