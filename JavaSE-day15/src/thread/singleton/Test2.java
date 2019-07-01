package thread.singleton;

public class Test2 {
	public static void main(String[] args) {
		
		ProductDb pdb = ProductDb.getProductDb();
		ProductDb pdb2 = ProductDb.getProductDb();
		
		System.out.println(pdb);
		System.out.println(pdb2);
	}
}
