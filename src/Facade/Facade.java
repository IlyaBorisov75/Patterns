package Facade;


public class Facade {
	Engineer engineer = new Engineer();
	Packer packer = new Packer();
	Seller seller = new Seller();
	
	public void Sell(String product) {
		engineer.produñe(product);
		packer.PackageProduct(product);
		seller.SellProduct(product);
	}
}
