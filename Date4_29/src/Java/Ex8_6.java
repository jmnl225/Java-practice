package Java;

public class Ex8_6 {
	public static void main(String[] args) {
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println(5);
		}
		
	}
	
	static void method1() {
		try {
			method2();
			System.out.println(1);
		}catch(ArithmeticException e) {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		
		System.out.println(4);
	}// method1 end.
	
	
	static void method2() {
		throw new NullPointerException();
	}
	
}