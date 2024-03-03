package Constructor;

class Demo {
  public int value = 20;

  Demo() {
    value = 40;
  }
}

public class ctrQ1 {
  public static void main(String args[]) {
		Demo demo = new Demo();
		System.out.println(demo.value);
	}
}
