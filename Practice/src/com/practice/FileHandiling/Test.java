package com.practice.FileHandiling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File fileread=new File("D:\\sample.txt");
		File fileWrite=new File("D:\\testFile.txt");
		FileInputStream fis=new FileInputStream(fileread);
		FileOutputStream fos=new FileOutputStream(fileWrite);
		
		
		byte[] barray=new byte[(int) fileread.length()];
		
		fis.read();
		fos.write(barray);
//		int i=0;
		
		
		
//		while((i=fis.read()) !=-1) {
//			System.out.print((char)i);
//			fos.write(i);
//		}
//		
		System.out.println("done");
		fis.close();
		
		
		
		
	}

}
