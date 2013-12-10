package StrategyPattern.after.upgrade.upgrade2.try4;

public class MuteQuack implements QuackBehavior {

	public MuteQuack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
