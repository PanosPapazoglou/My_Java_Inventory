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
 * 4. l1.iterator(); => pernoume enan iterator gia na kinithoume mesa stin lista pio eykola me tin it.hasNext() kai tin it.next()
 * 
 * Eno gia ton iterator exoume ta exis
 * 1. it,hasnext() => gia na elegxoume an iparxei epomeno element se sxesi me to pou briskomaste (index)..
 * 2. it.next() => gia na paroume tin timi tou epomenou element
 */
package org.thenewboston.intermediate.i4;

import java.util.*;

public class IntroductionToCollections {

  public static void main(String[] args) {

    String[] things = {"eggs", "lasers", "hats", "pie" };
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

    editList(list1, list2);
    System.out.println();

    for (int i = 0; i < list1.size(); i++) {
        System.out.printf("%s ", list1.get(i));
    }
}

public static void editList(Collection<String> l1, Collection<String> l2) {
    Iterator<String> it = l1.iterator();

    while(it.hasNext()) {
        if(l2.contains(it.next())) {
            it.remove();
        }
    }
}
}