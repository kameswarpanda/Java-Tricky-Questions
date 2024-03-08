class Loan {
	int interestRate;

	Loan(int interestRate) {
		this.interestRate = interestRate;
		System.out.println("Request for loan");
	}
}

public class HomeLoan extends Loan {
	int interestRate;

	HomeLoan() {
		super(10);
		interestRate = super.interestRate;
		System.out.println("Request for home loan " + interestRate);
	}

	public static void main(String args[]) {
		HomeLoan homeLoan = new HomeLoan();
	}
}