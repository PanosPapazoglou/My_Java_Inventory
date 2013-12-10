package SeperateVaryFromNonChangable.after.upgrade.upgrade3.try5;

public abstract class Duck {

	// +4+ Ftiaxnoume 2 nea reference variables gia ta behavior interfaces types
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	
	
	public Duck(){
		// TODO Auto-generated constructor stub		
	}

	// -- All Ducks Swim - Thats why we put the code here in the abstract class
  // Generaly code for a duck to swim	
	public void swim(){
		System.out.println("I am swimming!");
	}

	
	// -- Afairoume tis methodous fly() kai quack() apo tin superclass afou paratiroume oti
	//    eite kapoia eidi den petane i den kanoun quack
	//    eite to kanoun alla me diaforetiko tropo
	//    Etsi den eimaste se thesi na grapsoume ena genikeymeno kodika meso aytis tis superclass

	// +4+ Ftiaxnoume 2 nees methodous oi opoies tha zitoun apo tin anstistixi klasi behavior(pou tha ilopoiiei to behavior interface) na ektelesi tin diadikasia pou theloume
 	//       kanontas xrisi ton 2 neon reference variables ton behavior interfaces types pou orisame parapano!!
	public void performFly(){
		flybehavior.fly();
	}
	
	public void performQuack(){
		quackbehavior.quack();
	}


	public void setFlyBehavior(FlyBehavior fb){
		flybehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackbehavior = qb;
	}
	 
	 
	// Each Duck subtype is responsible for implementing its own display() behavior for how it looks on the screen
  public abstract void display();


	// Other duck-like methods
	
}
