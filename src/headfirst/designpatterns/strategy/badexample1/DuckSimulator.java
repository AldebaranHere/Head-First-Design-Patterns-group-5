package headfirst.designpatterns.strategy.badexample1;

public class DuckSimulator {

	public static void main(String[] args) {
		simulate(new MallardDuck());
		simulate(new RedheadDuck());

		// Note: Both rubber duck and decoy duck do not fly.
		simulate(new RubberDuck());
		simulate(new DecoyDuck());

		/*
	   		Note: Imagine if we have to add more type of ducks. What are the
	   		chores that we need to implement a new type of duck?

		   1. Implement display() --> Due to abstract modifier. If the contract
			  says so, we have to comply with it. ¯\_(ツ)_/¯
		   2. Ensure the inherited swim() is correct for the new duck -->
			  otherwise, override it
		   3. Ensure the inherited quack() is correct for the new duck -->
			  otherwise, override it
		   4. Ensure the inherited fly() is correct for the new duck -->
			  otherwise, override it

		   Now imagine another scenario where we found a bug in the fly()
		   implementation at the superclass. Once we fixed the bug, we have
		   to make sure all fly() methods, inherited or overridden, are
		   correct across subclasses.

		   Overriding a method does not always mean the method is completely
		   rewritten in the subclass. Remember that it is possible to call the
		   original inherited implementation by using 'super' keyword when
		   overriding a method.

		   If there are variation in duck's behaviours across its subclasses,
		   how about implementing them as interface? Will it yield a better
		   solution?

		   (go to badexample2 package)
		 */
	}

	private static void simulate(Duck duck) {
		duck.display();
		duck.swim();
		duck.quack();
		duck.fly();
	}
}
