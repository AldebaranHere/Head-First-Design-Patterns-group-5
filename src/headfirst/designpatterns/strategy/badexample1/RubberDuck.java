package headfirst.designpatterns.strategy.badexample1;

public class RubberDuck extends Duck {

	@Override
	void display() {
		System.out.println("This is a rubber duck!");
	}

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

	@Override
	public void fly() {
		// No-op. Rubber duck does not fly.
	}
}
