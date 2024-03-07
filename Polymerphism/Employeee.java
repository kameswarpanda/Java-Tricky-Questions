public class Employeee {
	private String name;
	private int empId;
	private String city;

	Employeee() {
		this.city = "New York";
	}

	Employeee(String name, int empId) {
		this();
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {
		Employeee employee1 = new Employeee("John", 101);
		Employeee employee2 = new Employeee();

		System.out.println(employee1.name + " " + employee1.empId + " "
				+ employee1.city);
		System.out.println(employee2.name + " " + employee2.empId + " "
				+ employee2.city);
	}
}