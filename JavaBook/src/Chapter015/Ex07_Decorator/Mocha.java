package Chapter015.Ex07_Decorator;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}
}
