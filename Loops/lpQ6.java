package Loops;

public class lpQ6 {
  public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		while (num1 >= 2) {
			if (num1 > num2) {
				num1 = num1 / 2;
			} else {
				System.out.println(num1);
				break;
			}
		}
	}
}
