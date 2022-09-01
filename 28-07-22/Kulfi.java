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
   
   
   class Kulfi
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
	  
	Kulfi()   
	{
				System.out.println("========================");
		System.out.println("details of icecream");
	} 
    Kulfi(double price)
	{
		this();
		System.out.println("__________");
			System.out.println("double constructer exuited");
	}	
	Kulfi(double price,String type)
	{
		this(price,type);
		//this(types);
		System.out.println("__________");
	   System.out.println("double String constructer exuited");
	   //this.price=price;
	   this.type=type;
	}
	Kulfi(double price,String type,String color)
	{  this(price,type,color);
	    this.price=price;
		this.type=type;
		this.color=color;
	  //this(type);
	 // this(color);
	  //System.out.println("__________");
	   System.out.println("double String String constructer exuited");
		}
		Kulfi(double price,String type,String color,String brand)
		{
			this(price,type,color,brand);
			this.price=price;
			this.type=type;
			this.color=color;
			this.brand=brand;
				   System.out.println("double String String constructer exuited");
		}
		Kulfi(double price,String type,String color,String brand,double weight)
		{ 
		this(price,type,color,brand,weight);
		this.price=price;
			this.type=type;
			this.color=color;
			this.brand=brand;
			this.weight=weight;
				   System.out.println("double String String constructer exuited");
			
		}
		Kulfi(double price,String type,String color,String brand,double weight,double quantity)
		{
          this(price,type,color,brand,weight);
			this.quantity=quantity;
				   System.out.println("double String String constructer exuited");
			
		}
		Kulfi(double price,String type,String color,String brand,double weight,double quantity,boolean dryFruit)
		{
			
		
		          this(price,type,color,brand,weight,quantity);
			this.dryFruit=dryFruit;
			
				   System.out.println("double String String constructer exuited");
		}	
   }	
   