package excersize01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ProductSave {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product p1 = new Product("p01", "苹果1", 5.5f);
		Product p2 = new Product("p02", "苹果2", 6.5f);
		Product p3 = new Product("p03", "苹果3", 7.5f);
		Product p4 = new Product("p04", "苹果4", 8.5f);
		
		ArrayList<Product> pList = new ArrayList<>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/pdt.obj"));
		oos.writeObject(pList);
		
		oos.close();
	}

}
