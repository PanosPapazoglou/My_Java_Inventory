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
 *                          
 *                               							A L L A !!!!!
 *             
 *             
 * Skepseis  : Xeroume oti den prepei oles ta eidi ton papion prepei na petane fly() i na bgazon ixous quack()
 *             kai ara i kleironomikotita (Inheritance) den einai lisi!!
 *             Dimiourgontas ta Interfaces kai bazontas to concrete classes na ilopoioun tis methodous pou exoun kathoristei sta Interfaces
 *             linei nai men to parapano problima afou mono osa eidi papias petane i kanoun quack tha prepei na kanoun implement ta
 *             antistoixa interfaces kai na ulopoiisoun tis antistoixes methodous tous fly() gia to Flyable Interface kai quack() gia to Quackable Interface
 *             ALLA katastrefei teleios to code reuse kai tin kentropoisis pou mas parexei to Inheritance!!!!
 *             Ayto exei san apotelesma na prepei na grafoume endexomenos kai idia pragmata se kathe ena apo ta eidi papias stis antistoixes methodous tous fly() kai quack()
 *             pragma pou simainei oti glitonoume apo ton 1o efialti ton if() mesa sto ekastote subclass alla sto telos grafoume ta idia kai ta diia endexomenos 
 *             mesa se ayto to subclass(dialdi sta eidi ton papion) 
 *             Ti mporoume na kanoume oste :
 *                a) Na apotrepoume to na ektelounte lathos leitourgies se ena eidos papias (p.x. na petaei eno den epitrepete)
 *                       i na bazoume if...mesa stis methodous ton subclasses..
 *                b) Alla apo tin alli na min xreiazomaste na kanoume duplicate coding stis methodous mesa se kathe eidos papias???
 *                     p.x. fantasou na prepei na kaneis mia allagi (tin idia..) se ola ta 48 eidi papias pou petane
 *                   kai pou na fantastoume oti oxi mono den tha epitrepete na petaei i na bgazei ixous mia papia
 *                   alla mporei na to kanei kai diaforetika...epomenos na prepei telika na grafoume kai diafoeritika eidi kodika gia tin idia leitouria
 *                   mesa stis methodous tis concrete subclass tis papias diladi mesa se kathe eidos papias..   
 *                   
 *                                           
 *                                           --> CONSTANT IN SOFTWARE DEVELOPMENT ==> C H A N G E !!! <--    
 *                      
 *                      
 * Design 
 * Principle (1) : Identify the aspects of your application that vary
 *                   and seperate them from what stayes the same!!             
 *                 
 *                 -> Take what varies and "encapsulate" it so it won't affect the rest of your code
 *                 -> The result? Fewer unintended consequences from code changes and more flexibility in your systems
 *              
 *                 -> Take the parts that vary and encapsulate them, 
 *                 -> so that later you can alter or extend the parts tha vary .
 *                 -> without affecting those that don't!!
 *             
 * Solution 4 : Basismenoi loipon sto 1o Sxediastiko kanona tha prepei na xexorisoume ayta pou allazoun apo ayta pou paramenoun idia
 *              Epomenos idia menoun edo to pos kolimpane oles oi papies
 *              eno diaforetika einai to pos petane kai kanoun quack 
 *              (bebaia diaforetika einai kai to pos fainontai display() alla ekei einai teleios diaforetika se kathe eidos papias opote
 *               profanos kai apla to kratame mesa stin concrete subclass (eidos papias) pros ilopoiisi )
 *              
 *              Me ta parapano katalabainoume oti to petagma fly() kai o ixos quack() allazoun kai tha allazoun sinexos kai sto mellon
 *              epomenos tha prepei na ta apokentrosoume - diladi na ta bgaloume ektos tis klasis Duck os behavious (os methodoi)
 *               
 *              
 *              
 *              
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
package SeperateVaryFromNonChangable.before.upgrade.upgrade2.try4;

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
