package headfirst.designpatterns.strategy.badexample2;

public class DecoyDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is a decoy duck");
	}
}
