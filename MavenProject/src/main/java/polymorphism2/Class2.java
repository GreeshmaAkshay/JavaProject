package polymorphism2;

public class Class2 extends Class1{
	public int addition() {
		super.addition();
		if(super.sum % 10 ==0) {
			System.out.println(sum+" is divisible by 10");
		}
		else {
			System.out.println(sum+" is not divisible by 10");
		}
		return sum;
	}
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.addition();

	}

}
