package org.thenewboston.intermediate.i1;

public class CommonStringMethods {

	public static void main(String[] args) {
		
		String[] words = {"funk" , "chunk" , "furry" , "baconator"};
		
		// Starts With
		for(String w:words){
			if(w.startsWith("fu")){
				System.out.println(w + " starts with fu");
			}
		}
		
		
		// Ends With
		for(String w : words){
			if(w.endsWith("nk")){
				System.out.println(w + " ends with nk");
			}
		}
		
		

	}

}
