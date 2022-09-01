class Chocolate
{
String name;
String flavour;
String brand;
double price;

Chocolate()
{
	System.out.println("details of chocolate");
}
Chocolate(String name)
{
	this();
	System.out.println("String constructer executed");
}
Chocolate(String name,String flavour)
{
	this(name);
	System.out.println("String String constructer executed");
	this.flavour=flavour;
}
Chocolate(String name,String flavour,String brand)
{  this(name,flavour);
	System.out.println("String String int constructer executed");
	this.brand=brand;
}
Chocolate(String name,String flavour,String brand,double price)
{
	this(name,flavour,brand);
	System.out.println("String String int double constructer executed");
	this.price=price;
}


}