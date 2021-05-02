package headfirst.designpatterns.strategy.badexample2;

public class DuckSimulator {

	public static void main(String[] args) {
		simulate(new MallardDuck());
		simulate(new RedheadDuck());

		// Note: Both rubber duck and decoy duck do not fly.
		simulate(new RubberDuck());
		simulate(new DecoyDuck());
	}

	private static void simulate(Duck duck) {
		duck.display();
		duck.swim();

		/*
			Note: If the varying behaviours (i.e., flyable & quackable among
			ducks) are causing maintainability issues due to inheritance,
			maybe we can try using Java's interface by ensuring only certain
			subtypes implement the said behaviours. But then, again, if we
			followed the bad example (i.e. the example before applying the
			design principles and pattern) from the book, the result is
			suboptimal.

			Let us suppose that majority of ducks can fly. If we have to model
			that phenomenon in the simulator, then most of the subtypes will
			need to implement Flyable interface. A very tedious job if there
			are a lot of subtypes and may have to duplicate the implementation
			across subtypes (which is the problem that supposed to be resolved
			by inheritance).

			To summarise:

			1. If we use inheritance naively, every changes in the class
			hierarchy are prone to error. We might introduced a bug when
			adding new behaviour or enhancing existing ones, and the bug is
			propagated to the classes down in the hierarchy. Or, the new
			behaviour is violating the expected behaviour down in the
			hierarchy. Hence, requiring us, the programmer, to pinpoint the
			exact class in the hierarchy and override the said behaviour
			there.

			2. If we opt to use interface to represent the behaviour across
			subtypes of Duck and make the subtypes that require the varying
			behaviours to implement it, we can avoid the issue of certain
			subtype(s) having improper implementation at the cost of code reuse.

			We will see how two design principles (i.e., variability
			encapsulation and program to an interface) when reviewing the
		    solution that uses design pattern.

		    (go to the code example in the parent package)
		 */
		if (duck instanceof Quackable) {
			((Quackable) duck).quack();
		}

		if (duck instanceof Flyable) {
			((Flyable) duck).fly();
		}
	}
}
