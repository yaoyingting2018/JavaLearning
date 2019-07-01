package thread.singleton;

public class Test1 {
	public static void main(String[] args) {
		
		/*ProductDb pdb1 = ProductDb.getProductDb();
		ProductDb pdb2 = ProductDb.getProductDb();

		System.out.println(pdb1);
		System.out.println(pdb2);*/
		
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ProductDb productDb = ProductDb.getProductDb();
				System.out.println(productDb);
			}
		});
		
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ProductDb productDb = ProductDb.getProductDb();
				System.out.println(productDb);
			}
		});
		
		t1.start();
		t2.start();
		
		
	}
}
