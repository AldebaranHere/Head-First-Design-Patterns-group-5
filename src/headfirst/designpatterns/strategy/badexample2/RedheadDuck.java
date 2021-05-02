package headfirst.designpatterns.strategy.badexample2;

public class RedheadDuck extends Duck implements Quackable, Flyable {

	@Override
	void display() {
		System.out.println("This is a redhead duck!");
	}

	@Override
	public void fly() {
		System.out.println("Flying!");
	}

	@Override
	public void quack() {
		System.out.println("Quacking!");
	}
}
