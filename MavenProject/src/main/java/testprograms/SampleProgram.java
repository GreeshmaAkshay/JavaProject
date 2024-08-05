package testprograms;

public class SampleProgram {
	
	public void add(int a, int b) {
		int sum= a+b;
		System.out.println("The sum of and b :"+sum);
	}

	public static void main(String[] args) {
		SampleProgram ad = new SampleProgram();
		ad.add(2,3);
	}

}
