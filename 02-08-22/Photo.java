class Photo
{
int size;
double price;
String shape; 
int warranty;
PhotoFrameMaterial material;
Color[] color;


Photo(int size,double price,int warranty)
{
	this.size=size;
	this.price=price;
	this.warranty=warranty;
	
}
void setShape(String shape)
{
	this.shape=shape;
}
void setMaterial(PhotoFrameMaterial material)
{
	this.material=material;
}
void setColor(Color[] color)
{
	this.color=color;
}
void printAllData()
{
System.out.println(this.size);
System.out.println(this.price);
System.out.println(this.warranty);
System.out.println(this.shape);

System.out.println(this.material);
for(int d=0;d<this.color.length;d++)
{
System.out.println(this.color[d]);
}
}
	
}
