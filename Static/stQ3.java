package Static;

//What will be the output of the code given below?

class Computer {
	private static int id;
	private static int counter = 0;

	public Computer() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	// Rest of the methods
}

public class stQ3 {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		Computer comp3 = new Computer();
		System.out.println(comp1.getId() + " " + comp2.getId() + " "
				+ comp3.getId());
	}
}