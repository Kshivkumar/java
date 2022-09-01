class Chocolate
{
String name;
String flavour;
int brand;
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

}