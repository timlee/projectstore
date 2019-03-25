
public class Client {
	Store fruitstore = new Store();
        string name;
	double price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client Tim = new Client();
		
		//Client Bill = new Client();
		Tim.buyProduct();

	}
	
	public void buyProduct(){
		Apple a = new Apple();
		price = fruitstore.sell(a);
		System.out.println(price);
	}

}
