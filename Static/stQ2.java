package Static;

// Predict the output of the code given below.

class Printer {
	static {
		System.out.println("Static block in Printer class");
	}

	public static void display(String message) {
		System.out.println(message);
	}
}

public class stQ2 {
	public static int sampleVariable = 1;

	static {
		System.out.println("Static block in stQ3 class");
	}

	public static void main(String[] args) {
		sampleVariable++;
		Printer p = null;
		System.out.println("In main");
		p.display("The value of sample variable is: " + sampleVariable);
	}
}
 

































// Static block in Printer class; Static block in Tester class; In main; The value of sample variable is: 2
// Static block in Tester class; Static block in Printer class; In main; The value of sample variable is: 2
// Static block in Tester class; In main; Static block in Printer class; The value of sample variable is: 2
// Static block in Tester class; In main; The value of sample variable is: 2; Static block in Printer class
