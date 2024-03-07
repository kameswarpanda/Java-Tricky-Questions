package Inheritance;

class Customer {
	public Customer() {
		System.out.println("Customer");
	}
}

class RegularCustomer extends Customer {
	public RegularCustomer() {
		System.out.println("Regular Customer");
	}
}

class PremiumCustomer extends RegularCustomer {
	public PremiumCustomer() {
		System.out.println("Premium Customer");
	}
}

public class InQ1 {
  public static void main(String[] args) {
		PremiumCustomer premiumCusotmer = new PremiumCustomer();
	}
}
