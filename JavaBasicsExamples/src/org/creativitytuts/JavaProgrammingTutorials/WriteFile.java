package org.creativitytuts.JavaProgrammingTutorials;

import java.io.*;

public class WriteFile {

	public static void main(String[] args){
		
		// Create a File Object (tha graftei sto root directory tou root file tou eclipse - D:\___workspace\java\My_Java_Inventory\JavaBasicsExamples)
		// Dhmiourgoyme to arxeio 
		File f = new File("test.txt");  //test.txt is the name of the file we want to write 
		
		
		
		try {
			// We need to create an object which will write ti the file object
			// Filewriter (easiest), bufferwriter (more complex)
			// Einai aparaitito na to perasoume apo try/catch giati mporei na min mporei na dimiourgisei ayto to arxeio...
			
			// dimiourgoume to object FileWriter pou grafei sto arxeio
			FileWriter fw = new FileWriter(f,true); // San argument tou constructor tou thelei to File Object pou dimiourgisame parapano
																							// To true simainei oti tha kanei append kai den tha kanei ovveride proigoumenes eggrafes sto keimeno
			
			
			//Grafoume sto arxeio
			 fw.write("This is file writing test in Java");
			 fw.write(System.getProperty( "line.separator")); // Me ayto ton tropo allazoume grammi..
			
			 
			
			//kleinoume to stream..
			fw.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
	
	
	
}
