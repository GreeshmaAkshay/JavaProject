package hierarchichal;

public class Child1 extends ParentHierarchical {
	public void sub() {
		int diff = b-a;
		System.out.println("Difference is "+diff);
	}
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.add();
		c1.sub();

	}

}
