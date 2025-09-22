package object_oriented_practice.ch06_star.test;

public class Printer {
	//16
	void println(int A) {
		System.out.println(A);
	}
	
	void println(boolean B) {
		System.out.println(B);
	}
	
	void println(double C) {
		System.out.println(C);
	}
	
	void println(String D) {
		System.out.println(D);
	}
	
	//17
	static void println1(int A) {
		System.out.println(A);
	}
	
	static void println1(boolean B) {
		System.out.println(B);
	}
	
	static void println1(double C) {
		System.out.println(C);
	}
	
	static void println1(String D) {
		System.out.println(D);
	}
	public static void main(String[] args) {
		//16
		//Printer printer = new Printer();
		//printer.println(10);
		//printer.println(true);
		//printer.println(5.1);
		//printer.println("응애");
		
		//17
		println1(10);
		println1(true);
		println1(5.65);
		println1("응애");
	}
}
