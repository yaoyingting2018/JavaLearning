package sortutil2;

public class PriceBijiaoqi implements BijiaoQi<Product> {

	@Override
	public boolean bijiao(Product p1, Product p2) {
		if(p1.getPrice()> p2.getPrice()) {
			return true;
		}
		return false;
	}

}
