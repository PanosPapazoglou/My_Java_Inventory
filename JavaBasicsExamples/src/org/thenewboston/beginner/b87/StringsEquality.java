package org.thenewboston.beginner.b87;

public class StringsEquality {

	public static void main(String[] args){
		String a = "apples";
		String d = a;
		String b = "bucky";
		String c = "BUCKY";
		System.out.println(a.length());
		
		// An theloume na elegxoume tin isotita 2 antikeimenon tote tha prepei na xrisimopoiisoume tin methodo equals
		// ayto simbainei giati oi metablites pou pame na sigkrinoume einai diktes sta antikeimena (ta..tilekontrol...)
		// ..kai oxi ta idia ta antikeimena..
		// etsi se epipedo bytes...profanos kai tha exoun alli allilouxia bytes..ara den tha einai idia..
		if(a==d){
			System.out.println("oi deiktes edo einai idio!!");
		}
		
		// Elexgxos isotitas enos String Object me String..
		if(a.equals("apples")){
			System.out.println("It equals apples!");
		}

		// Elexgxos isotitas enos String Object me ena allo String Object		
		if(b.equals(c)){
			System.out.println("buckys match");
		}
		
		// An theloume na elegxoume tin isotita asxetou Case Sensitivity (kefalaia..peza..)
		if(b.equalsIgnoreCase(c)){
			System.out.println("buckys match");
		}		
		
	}
	
}
