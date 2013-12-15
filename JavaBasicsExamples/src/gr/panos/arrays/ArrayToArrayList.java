package gr.panos.arrays;

import java.util.*;

public class ArrayToArrayList {

	public static void main(String[] args){

    String[] stuff = {"babies", "watermelon", "melon", "fudge"};
     List<String> thelist = Arrays.asList(stuff);
    //LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));  // <--------
    
    ListIterator<String> bobby = thelist.listIterator();
    while(bobby.hasNext()) {
        System.out.printf("%s ", bobby.next());
    }
		
	}
	
	
}
