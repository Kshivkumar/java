class Image
{
int size;
double price;
String shape; 
int warranty;
ImageFrame material;
Color[] color;


Image(int size,double price,String shape,int warranty)
{
	this.size=size;
	this.price=price;
	this.shape=shape;
	this.warranty=warranty;
}
void setMaterial(ImageFrame material)
{
this.material=material;

}
void setColor(Color[] color)
{
	this.color=color;
}
void printData()
{
	System.out.println(this.size);
   System.out.println(this.price);
    System.out.println(this.shape);
    System.out.println(this.warranty);
	System.out.println(this.material);
	
	for(int s=0;s<this.color.length;s++)
	{
		System.out.println(this.color[s]);
	}
}
}
