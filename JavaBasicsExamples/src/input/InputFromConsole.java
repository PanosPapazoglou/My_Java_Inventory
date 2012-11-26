package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromConsole {
	
	public static void main(String[] args) {	
		int radius = 0;
		System.out.println("Please enter radius of a circle");
				
	    //get the radius from console
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    try {
			radius = Integer.parseInt(br.readLine());
		} catch (NumberFormatException nfe) {
			// TODO Auto-generated catch block
			nfe.printStackTrace();
            System.out.println("Invalid radius value #" + nfe+"#");
            System.exit(0);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
            System.out.println("IO Error :" + ioe);
            System.exit(0);			
		}
	    
	    
	    System.out.println("You enter : "+radius);
	    
	}
	
}
