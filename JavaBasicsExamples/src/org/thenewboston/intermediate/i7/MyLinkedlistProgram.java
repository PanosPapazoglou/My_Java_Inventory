package org.thenewboston.intermediate.i7;

import java.util.*;

public class MyLinkedlistProgram {
  public static void main(String[] args) {

    String[] things = {"apples", "noobs", "pwnage", "bacon", "goats"};
    List<String> list1 = new LinkedList<String>();

    for(String x: things) {
        list1.add(x);
    }

    String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
    List<String> list2 = new LinkedList<String>();

    for(String y: things2) {
        list2.add(y);
    }

    list1.addAll(list2);
    list2 = null;
    printMe(list1);
    removeStuff(list1, 2, 5);
    printMe(list1);
    reverseMe(list1);

	}
	
	//printMe method
	private static void printMe(List<String> l) {
	    for(String b : l) {
	        System.out.printf("%s ", b);
	    }
	
	    System.out.println();
	}
	
	//removeStuff method
	private static void removeStuff(List<String> l, int from, int to) {
	  // To cubList epistrefei ena view portion tis listas
		// kai to clear epi tou portion pou anoikei se ayti tin lista... exei epidrasi stin idia tin lista 
		// tis opoias to view portition ginete clear!!!
		// pantos prokeite gia mia standar diadikasia..an theloume na efairesoume meros mias listas..
		// pernoume to view portion (uposinolo listas se epipedo view...kai ekteloume itn clear sto apotelesma..)
		l.subList(from, to).clear();
	}
	
	//reverseMe method
	private static void reverseMe(List<String> l) {
	    ListIterator<String> bobby = l.listIterator(l.size());
	    while(bobby.hasPrevious()) {
	        System.out.printf("%s ", bobby.previous());
	    }
	}
}