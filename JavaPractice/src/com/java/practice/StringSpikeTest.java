package com.java.practice;
import java.io.File;

public class StringSpikeTest {
	// get the root path and check for sub folders list
	// iterate sub folders 
	public static void main(String args[]){

		File file = new File("C:/MyFolder/");


		for(File f: file.listFiles()){
			System.out.println(f.getName());
			File newFile = new File("C:/MyFolder/"+f.getName());

			if(newFile.isDirectory()){
				for(File nf :newFile.listFiles())
					System.out.println("Sub folders: "+nf.getName());

				if(newFile.getName().equals("sent")){
					// write copy logic
				}

				if(newFile.getName().equals("receive")){
					// paste logic
				}
			}
		}

	}


}
