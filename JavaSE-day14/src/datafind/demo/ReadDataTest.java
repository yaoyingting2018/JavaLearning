package datafind.demo;

import java.util.List;

public class ReadDataTest {
	public static void main(String[] args) throws Exception {
		ReadData readData = new ReadData();
		
		Product p = readData.findProductById(3);
		System.out.println(p);
		//List<Product> pList = readData.findProductByName("菠萝");
		//System.out.println(pList);

		//System.out.println(p.getId() + ","+ p.getName() +"," + p.getPrice());
		
	}
}
