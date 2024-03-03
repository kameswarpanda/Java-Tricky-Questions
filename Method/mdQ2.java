package Method;

public class mdQ2 {
  public int subtract(int a, int b) {
		return (a - b);
	}

	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		mdQ2 tester = new mdQ2();
		int res = tester.subtract(b, a);
		System.out.println(res);
	}

}
