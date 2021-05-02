package headfirst.designpatterns.strategy.badexample2;

public abstract class Duck {

	public void swim() {
		System.out.println("Swim!");
	}

	/**
	 * Note: display() is an abstract method because each type of duck has
	 * unique 'display'/representation. At this point, we cannot make a
	 * universal representation of a duck. The actual representation is
	 * handled by each subclass.
	 */
	abstract void display();
}
