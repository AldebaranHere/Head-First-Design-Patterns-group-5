package headfirst.designpatterns.strategy.badexample1;

public abstract class Duck {

	public void quack() {
		System.out.println("Quack!");
	}

	public void swim() {
		System.out.println("Swim!");
	}

	/**
	 * Note: Yes. We can maximise code reuse by adding a new behaviour (i.e.
	 * method) in a class that has multiple subclasses. By doing that, the
	 * new behaviour will be inherited to all of the subclasses. If the new
	 * behaviour is **required and behave uniformly** across all current
	 * subclasses and possible future new subclasses, then by all means, use
	 * inheritance. However, if it is possible that one or more subclasses
	 * have to override the inherited method or does not require the inherited
	 * method, it might be not a good idea to use inheritance. Imagine the
	 * changes had to be made if there are multiple classes that do not require
	 * the inherited method.
	 */
	public void fly() {
		System.out.println("Fly!");
	}

	/**
	 * Note: display() is an abstract method because each type of duck has
	 * unique 'display'/representation. At this point, we cannot make a
	 * universal representation of a duck. The actual representation is
	 * handled by each subclass.
	 */
	abstract void display();
}
