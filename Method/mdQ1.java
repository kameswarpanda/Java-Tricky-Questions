package Method;

public class mdQ1 {
  public void demoMethod() {
		int varOne = 1000;
		float varTwo = 20.00f;
		double varThree = 0.0;
		varThree = (double) (varTwo + varOne * (7.0 / 100));
		System.out.println("varThree:" + varThree);
	}

	public static void main(String args[]) {
		mdQ1 tester = new mdQ1();
		tester.demoMethod();
	}
}
