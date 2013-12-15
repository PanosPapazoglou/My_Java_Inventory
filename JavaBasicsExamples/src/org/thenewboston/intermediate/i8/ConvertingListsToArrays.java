/* Java has some methods for arrays and some other usefull for Arraylist
 * so for that reason we may want some time to change from one to the other..
 */
package org.thenewboston.intermediate.i8;

import java.util.*;

public class ConvertingListsToArrays {

  public static void main(String[] args) {

    String[] stuff = {"babies", "watermelon", "melon", "fudge"};
    LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

    thelist.add("pumpkin");
    thelist.addFirst("thefirstthing");

    //convert back to an array
    stuff = thelist.toArray(new String[thelist.size()]);

    for(String x : stuff) {
        System.out.printf("%s ", x);
    }
  }
  
}
