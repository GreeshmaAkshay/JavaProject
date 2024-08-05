package inheritance;

public class Child extends Parent{
	public void print() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		Child objchild = new Child();
		objchild.add();
		objchild.print();
	}

}
