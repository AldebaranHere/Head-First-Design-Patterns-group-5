package headfirst.designpatterns.strategy.badexample1;

public class DecoyDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is a decoy duck");
	}

	@Override
	public void fly() {
		// No-op. Decoy duck does not fly.
	}
}
