package FILEIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test2 {

	public static void main(String[] args) throws IOException {
	
		//File f=new File("abc.txt");
		
		
		//FileWriter fw= new FileWriter(f);
		
		/*fw.write(65);
		fw.write("\n");
		fw.write("sri");
		fw.flush();
		fw.close();*/
		
		//BufferedWriter bw= new BufferedWriter(fw);
		
	/*	bw.write(65);
		bw.newLine();
		bw.write("sri");
		bw.flush();
		bw.close();*/
		
		
		PrintWriter pw= new PrintWriter(new FileWriter(new File("abc.txt"),true));
		
		pw.println(165);
		pw.println(65.75f);
		pw.println(true);
		pw.println("sri");
		
		pw.flush();
		pw.close();
		

	}

}
