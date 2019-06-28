package datafind.demo;

public class Test {
	public static void main(String[] args) {
		String a = "SELECT * FROM p.dat WHERE id=399";
		System.out.println(a.substring(a.indexOf("=")+1));
	}
}
