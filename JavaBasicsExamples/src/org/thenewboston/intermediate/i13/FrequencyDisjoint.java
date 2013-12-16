package org.thenewboston.intermediate.i13;

import java.util.*;

public class FrequencyDisjoint {
  public static void main(String[] args) {

    //convert stuff array to list
     String[] stuff = {"apples", "beef", "corn", "ham"};
     List<String> list1 = Arrays.asList(stuff);

     ArrayList<String> list2 = new ArrayList<String>();
     list2.add("youtube");
     list2.add("google");
     list2.add("digg");

     for(String x : list2) {
         System.out.printf("%s ", x);
     }

     // Me ayti tin methodo prosthetoume ola ta stoixeia tou pinaka stuff sto collection list2
     Collections.addAll(list2, stuff);

     System.out.println();

     for(String x : list2) {
         System.out.printf("%s ", x);
     }

     System.out.println();

     // Ayti i entoli tha mas epistrepsei poses fores brike to String "digg" stin lista mas
     // Epomenos tha mporousame na to xrisimopoiisoume kai gia na kanoume search kai na elegxoume an se ena array iparxei ena element
     // if(Collections.frequency(list2, "digg"))>0 iparxei to element..
     System.out.println(Collections.frequency(list2, "digg"));
     
     boolean tof = Collections.disjoint(list1, list2);
     System.out.println(tof);

     if (tof) {
    	   // True simainei oti den exoume kanena element koino
         System.out.println("These lists do NOT have anything in common");
     } else {
    	   // False simainei oti exoun koina element
         System.out.println("These lists DO HAVE anything in common");
     }
 }
}
