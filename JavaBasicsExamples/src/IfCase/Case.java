package IfCase;

// TODO na olokliroso to example
public class Case {
	
	public final static int TITANIUM = 0; 
	public final static int PLATINUM = 1;
	public final static int GOLD = 2;
	public final static int SILVER = 3;
	public final static int TIN = 4;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Tin -----");
		printGift(TIN);
		System.out.println("Titanium -----");
		printGift(TITANIUM);

	}
	//QUESTION mporo na min exo break oste 2 case na exoun idies entoles;
	public static void printGift(int serviceLevel) {
		switch(serviceLevel) {
			case TITANIUM: 
			
			break;
			case PLATINUM: 
				System.out.println(" Free toaster");
			break;
				 
			case GOLD:
				System.out.println(" Free stapler");
			break;
				
			case SILVER: 
			
			break;
			
			case TIN:
				System.out.println(" Free staple remover");
			break;
			
			default:
				System.out.println("No gift");
		}
	}


}
