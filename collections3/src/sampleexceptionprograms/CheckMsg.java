package sampleexceptionprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {
	public static void main(String[] args)throws FileNotFoundException,IOException {
		try {
		File f=new File("C:\\Users\\DELL\\Desktop\\Hello.txt");
		FileReader fr=new FileReader(f);
        int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(" End");
		}
	}
}
