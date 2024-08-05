package polymorphism1;

public class Child extends Parent{
	public void add(){
		int sub = b-a;
		System.out.println("Difference ic "+sub);
		super.add();
	}
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.add();

	}

}
