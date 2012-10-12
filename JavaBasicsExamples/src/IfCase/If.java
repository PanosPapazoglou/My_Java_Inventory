package IfCase;

public class If {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean alive=true;
		
		
		// Boolean if (Start)
		if(alive){
			System.out.println("ALIVE is True!!");
		}
		
		if(!alive){
			System.out.println("DEAD!!");
		}else{
			System.out.println("ALIVE!!");
		}
		// Boolean if (End)

		
		// if equal (Start)
		int num = 1;
		if(num==1){
			System.out.println("num=1");
		}
		// if equal (End)
		
		
		// if diff (Start)		
		int num2 = 4;
		if(num2!=1){
			System.out.println("num2<>1");
		}
		// if diff (End)		
		
		
		// if greader (Start)		
		int num3 = 8;
		if(num3>1){
			System.out.println("num3 is greater than 1");
		}
		// if greader (End)
		
		
		// if greader-equal (Start)		
		int num4 = 5;
		if(num4>=5){
			System.out.println("num4 is greater than or equal to 1");
		}
		// if greader-equal (End)
		
		
		// if less (Start)		
		int num5 = 2;
		if(num5<100){
			System.out.println("num5 is less than 100");
		}
		// if less (End)
		
		
		// if less-equal (Start)		
		int num6 = 10;
		if(num6<=10){
			System.out.println("num6 is less than or equal to 10");
		}
		// if less-equal (End)		
		
		
		// if/Single Else (Start)
		int num7 = 15;
		if(num7<=10){
		  System.out.println("num7 <= 10 ");
		}else{
		  System.out.println("num7 > 10");	
		}
		// if/Single Else (End)
		
		
		
		// if/Multiple Else (Start)
		int num8 = 15;
		if(num8<=10){
			System.out.println("num8 <= 10");
		}else if (num8>10 && num8<15){
			System.out.println("10 < num8 < 15");	
		}else if(num8>=15){
			System.out.println("num8 >= 15");	
		}
		// if/Multiple Else (End)
		
		
		// if (AND / OR) (Start)
		boolean bln2=false;
		int num10 = 20;
		if(bln2==false  && num10==20){
			System.out.println("done");
		}
			
		
		
	}

}
