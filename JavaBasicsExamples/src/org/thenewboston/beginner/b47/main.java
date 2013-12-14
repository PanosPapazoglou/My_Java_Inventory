package org.thenewboston.beginner.b47;

public class main {
  public static void main(String[] args){
  	MoreOnStatic member1 = new MoreOnStatic("Megan", "Fox");
    MoreOnStatic member2 = new MoreOnStatic("Natalie", "Portman");
    MoreOnStatic member3 = new MoreOnStatic("Taylor", "Swift");
    
    
    System.out.println();
    System.out.println(MoreOnStatic.getMembers());
    System.out.println();
    System.out.println(member2.getFirst());
    System.out.println(member2.getLast());
    System.out.println(member2.getMembers());
    
    
 }
}
