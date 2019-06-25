package exception;

public class DivideZeroExceptionDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		try {
			int c = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("后续代码");
	}
}
