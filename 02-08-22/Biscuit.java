class Biscuit
{
        String  brand;
		double price;
		int expiryDate;
		double weight;
		int manufacturedBy;
		double quantity;
	    int noOfPieces;
		
	Biscuit()
	{
		System.out.println("details of biscuits");
	}
	Biscuit(String brand)
	{
		this();
		System.out.println("String consctructer executed");
	}
	Biscuit(String brand,double price)
	{
		this(brand);
		System.out.println("String double consctructer executed");
		this.price=price;
	}
	Biscuit(String brand,double price,int expiryDate)
	{
		this(brand,price);
		System.out.println("String double int constructer executed");
		this.expiryDate=expiryDate;
	}
	Biscuit(String brand,double price,int expiryDate,double weight)
	{
		this(brand,price,expiryDate);
		System.out.println("String double int double consctructer executed");
		this.weight=weight;
	}
	Biscuit(String brand,double price,int expiryDate,double weight,int manufacturedBy)
	{
		this(brand,price,expiryDate,weight);
		System.out.println("String double int double int consctructer executed");
		this.manufacturedBy=manufacturedBy;
	}
	Biscuit(String brand,double price,int expiryDate,double weight,int manufacturedBy,double quantity)
	{
		this(brand,price,expiryDate,weight,manufacturedBy);
		System.out.println("String double int double int double consctructer executed");
		this.quantity=quantity;
	}
	Biscuit(String brand,double price,int expiryDate,double weight,int manufacturedBy,double quantity,int noOfPieces)
	{
	   this(brand,price,expiryDate,weight,manufacturedBy,quantity); 
	   System.out.println("String double int double int double int consctructer executed");
	   this.noOfPieces=noOfPieces;
	}

		
		
}