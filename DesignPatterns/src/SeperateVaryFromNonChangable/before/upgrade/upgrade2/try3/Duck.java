/*
 * New Spec 2 / Before Design Pattern
 * ----------------------------------
 * 
 * New Spec 2: Xafnika apaitetai na mpoun sto programma kai xilina omoiomata papias (DecoyDuck)
 *             ta opoia oute petane , oute kanoun quack
 *             Etsi diapistonoume oti kai to inheritance (code reusage and one place to code on upgrade) exei apotixei
 *             stin periptosi ton sinexomenon diaforetikon simperiforon metaxi tis mitras papias kai ton eidon papias..
 *             
 * Skepseis  : Etsi to na kanoume sinexos override stis methodous ton concrete classes (ton eidon papias) den einai lisi...
 * 						 idios otan to project tha allazei sinexos xoris akomi na xeroun ti nea idi tha bazoun....
 *             kai ara akoma perissotera kai sixnotera overrides stis methodous fly(); kai quack() mesa stis concrete classes!!!
 *             EPOMENOS xreiazomaste ena pio katharo tropo antimetopisis mias tetoias katastasis!!
 *             Ena tropo pou na mas epitrepei mono se merikes kai oxi se oles tis papies na kanoun fly() kai quack()
 *             
 * Solution 3: Etsi apofasizoume na katafigoume stin logiki tou Interface!!
 *             Pio sigkekrimena tha bgaloume tis methodous fly() kai quack() exo apo tin abstract Superclass Duck
 *             kai tha ftiaxoume 2 Interfaces 
 *             a) Flyable() Interface    me mia    fly() method   
 *             b) Quackable() Interdace  me mia  quack() method            
 *             
 *  -----------------------------------------------------------------------------------------------------------------------------------
 * New Spec 1: H anabathmisi pou mas zitithike exei na kanei me tin dinatotita tis papias na petaei 
 * Solution 1: Etsi apofasizoume stin abstract klasi na baloume tin methodo fly() stin logiki ton quack() kai swim()
 *            etsi oles oi papies na exoun ayti tin dinatotita otan kanoume subclasses
 *
 * Problem 1 : Distixos me ayton ton tropo mporoun na petaxoun kai eidi papias pou den mporoun na petaxoun!!!
 * Solution2 : San 2i lisi loipon prokreinete to na  kanei OVERRIDE mesa stis CONCRETE CLASSES (diladi tis klasis ton eidon tis papias)
 *             tropoopiontas ton kodika oste aytes pou den mporoun na petoun na min petoun
 * 
 *  
 */
package SeperateVaryFromNonChangable.before.upgrade.upgrade2.try3;

public abstract class Duck {
	
	public Duck(){
		// TODO Auto-generated constructor stub		
	}

	// -- All Ducks quacks and Swim - Thats why we put the code here in the abstract class
  // Generaly code for a duck to quack

  // Generaly code for a duck to swim	
	public void swim(){
		System.out.println("I am swimming!");
	}

	// -- Afairoume tis methodous fly() kai quack() apo tin superclass afou paratiroume oti
	//    eite kapoia eidi den petane i den kanoun quack
	//    eite to kanoun alla me diaforetiko tropo
	//    Etsi den eimaste se thesi na grapsoume ena genikeymeno kodika meso aytis tis superclass

	
	// -- Each Duck subtype is responsible for implementing its own display() behavior for how it looks on the screen

	// Ftiaxnoume mia abstract methodo gia to abstract class Duck i opoia tha prepei na ilopoiithei apo ta subcalsses tou Duck
  public abstract void display();


	// Other duck-like methods
	
}
