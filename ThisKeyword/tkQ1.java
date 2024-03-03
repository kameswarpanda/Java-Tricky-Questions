package ThisKeyword;

public class tkQ1 {
  public int num1;
	public int num2;

	tkQ1 (int num1, int num2) {
		num1 = num1;
		num2 = num2;
	}

	public static void main(String args[]) {
		tkQ1 tester = new tkQ1 (20, 40);
		System.out.println(tester.num1);
		System.out.println(tester.num2);
	}
}
