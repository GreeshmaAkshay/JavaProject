package hierarchichal;

public class Child2 extends ParentHierarchical{
	public void multiplication() {
		int pro = a*b;
		System.out.println(pro);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c2 = new Child2();
		c2.add();
		c2.multiplication();
	}

}
