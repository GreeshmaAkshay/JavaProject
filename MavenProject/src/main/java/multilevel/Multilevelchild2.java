package multilevel;

public class Multilevelchild2 extends Multilevelchild1{
	public void display_age() {
		System.out.println("32");
	}
	public static void main(String[] args) {
		Multilevelchild2 mul = new Multilevelchild2();
		mul.display();
		mul.display_name();
		mul.display_age();
	}
}
