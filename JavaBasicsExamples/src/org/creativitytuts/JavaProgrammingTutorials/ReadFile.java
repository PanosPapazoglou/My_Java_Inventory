package org.creativitytuts.JavaProgrammingTutorials;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {

		// This objects holds our file
		//File f = new File("C:\\test.txt");
		File f = new File("test.txt");

		
		try {
			// This object can read a file
			FileReader fr = new FileReader(f);
			
			try {
				// i methodos read tou object FileReader diabazei ena xaraktira tin fora
				// Epomenos ston sh apothikeyete to ASCII number tou ekastote xaraktira 
				int ch = fr.read();
				
				// Otan ftasei sto telos tou arxeiou i read epistrefei -1
				// Epomenos oso tha iparxoun xaraktires..kane mia loupa kai tipone ton xaraktira
				// kai xanadiabaze ton epomeno xaraktira
				while(ch!=-1){
					// Prosoxi edo metatrepoume tous arithmous ASCII se xaraktires kanontas cast tin metabliti ch ligo prin tin tiposoume
					// (char)ch
					System.out.print((char) ch);
					ch = fr.read();
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
