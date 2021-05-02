package headfirst.designpatterns.strategy.badexample2;

public class RubberDuck extends Duck implements Flyable, Quackable {

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
