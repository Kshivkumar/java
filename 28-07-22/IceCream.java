//*IceCream
      //  String flavour;
   // double price;
    //String type;
   // String color;
    //String brand;
    //double weight;
    //double quantity;
    //boolean dryFruit;
    //boolean goodTaste;
   // int since;//

class IceCream
{
	String flavour;
   double price;
    String type;
    String color;
    String brand;
    double weight;
    double quantity;
    boolean dryFruit;
    boolean goodTaste;
    int since;
	
	IceCream()
	{
		System.out.println("========================");
		System.out.println("details of icecream");
	}
	IceCream(String flavour)
	{
		this();
	System.out.println("========================");
		System.out.println("String constructer executed");
		this.flavour=flavour;
	}
	IceCream(String flavour,double price)
	{
		this(flavour);
		System.out.println("===================");
		System.out.println("String double constructer executed");
		this.price=price;
	}
		IceCream(String flavour,double price,String type)
		{
			this(flavour,price);
			System.out.println("=================");
			System.out.println("String double String constructer executed");
			this.type=type;
		}
	  IceCream(String flavour,double price,String type,String color)
	  {
		  this();
		  System.out.println("==============");
		  System.out.println("String double String String constructer executed");
	  }
	  IceCream(String flavour,double price,String type,String color,String brand)
	  {
		  this();
		  System.out.println("=============");
		 System.out.println("String double String String String constructer executed");
	  }
	  IceCream(String flavour,double price,String type,String color,String brand,double weight)
	  {
		  this();
		 System.out.println("=============");
		 System.out.println("String double String String String double constructer executed");
	  }	
	  IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity)
	  {
		  this();
		 System.out.println("=============");
		 System.out.println("String double String String String double double constructer executed");
	  }	
	  IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit)
	  {
		  this();
		 System.out.println("=============");
		 System.out.println("String double String String String double double boolean constructer executed");
	  }	
	  IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit,boolean goodTaste)
	  {
		  this();
		 System.out.println("=============");
		 System.out.println("String double String String String double double boolean boolean constructer executed");
	  }	
	   IceCream(String flavour,double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit,boolean goodTaste,int since)
	  {
		  this();
		 System.out.println("=============");
		 System.out.println("String double String String String double double boolean boolean int constructer executed");
	  }	

	
	
}