package headfirst.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {
		// TODO Update code example to match with the description in the 2nd ed. of the book
		//      For now, the following edit was made to make the codebase compilable.
		Monster p1 = new Dragon("Dragon", true);
		Monster p2 = new Drakon("Drakon", 1, true);

		// ... later ...
		operation(p1);
		operation(p2);
	}

	public static Monster operation(Monster p) {
		// This code doesn't know or care what the concrete type of p is
		Monster pCopy = null;
		try {
			pCopy = p.copy();
			// do something useful with pCopy
			System.out.println("Operating with pCopy!");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return pCopy;
	}
}
