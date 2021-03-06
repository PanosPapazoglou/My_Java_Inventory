package org.thenewboston.intermediate.i14;

import java.util.*;

public class StacksPushPop {
  public static void main(String[] args) {

    Stack<String> stack = new Stack<String>();
    stack.push("bottom");
    printStack(stack);
    stack.push("second");
    printStack(stack);
    stack.push("third");
    printStack(stack);

    stack.pop();
    printStack(stack);
    stack.pop();
    printStack(stack);
    stack.pop();
    printStack(stack);

}

//printStack method giati tha tin xrisimopoiisoume mono se ayti tin klasi..den tha tin epikaleite alli klasi..
// kai static..gia na min xreiazetai na kanoume neo instance tis klasis mas apla kai mono gia na tin xrisimopoiisoume
// afou prokeite epi tis ousias..gia utility...method..
private static void printStack(Stack<String> s) {
    if(s.isEmpty()) {
        System.out.println("You have nothing in your stack");
    } else {
        System.out.printf("%s TOP \n", s);
    }
}
}
