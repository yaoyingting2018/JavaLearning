package datafind.demo;

public class ReadDataTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadData readData = new ReadData();
		
		Prodcut p = readData.findProductById(1);
		
		System.out.println(p.getId() + ","+ p.getName() +"," + p.getPrice());
	}

}
