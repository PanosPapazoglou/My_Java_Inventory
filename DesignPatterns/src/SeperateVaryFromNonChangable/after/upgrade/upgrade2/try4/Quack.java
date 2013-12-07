package SeperateVaryFromNonChangable.after.upgrade.upgrade2.try4;

public class Quack implements QuackBehavior {

	// O constructor tha prepei na einai CaseSensitive idios me tin klasi
	// Episis den tha prepei na exei o basikos constructor..tipota pera apo to public..gia otan kanoume ena aplo new..
	public Quack() {
		//System.out.println("Quack object created!!");
	}

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
