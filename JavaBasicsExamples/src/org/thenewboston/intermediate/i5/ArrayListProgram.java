/*
 * Ta collections einai san tous pinakes
 * i diafora einai oti stous pinakes prepei na dilosoume apo tin arxi posa stoixeia tha prepei na kratane
 * eno sta collection den xreiazete (blepe domes dedomenon listes..diasindedemenes listes klt ktl klt)
 * Etsi edo exoume ta collections , sets ktl...
 * Gia paradeigma ta sets einai san ta collections alla den mporoun na periexoun diplotipa mesa tous
 * 
 * Ara gia to arraylist() object exouyme ta exis..
 * 1. list1.add(item) => gia prosthiki enos element stin lista mas
 * 2. list1.size() => gia to megethos tis listas
 * 3. list1.get(i) => gia na feroume data apo tin lista pou briskontai sto sigkekrimeno index
 */
package org.thenewboston.intermediate.i5;

import java.util.*;

public class ArrayListProgram {

  public static void main(String[] args) {

  	// This is an array of things..
    String[] things = {"eggs", "lasers", "hats", "pie" };
    
    // This is a list of things..
    // List<String>  ==? Auto simainei oti efarmozoume casting sta data diladi ti tipou object tha einai
    // diladi ti tipou data tha krataei ayti i lista..
    List<String> list1 = new ArrayList<String>();

    //add array items to list
    for (String x: things) {
        list1.add(x);
    }

    String[] morethings = {"lasers", "hats" };
    List<String> list2 = new ArrayList<String>();

    //add array items to list
    for (String y: morethings) {
        list2.add(y);
    }

    for (int i = 0; i < list1.size(); i++) {
        System.out.printf("%s ", list1.get(i));
    }
}
  
}
