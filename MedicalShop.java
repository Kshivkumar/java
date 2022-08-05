class MedicalShop
{ 
    String medicineName;
    double price;
    int quantity;
	
	
	MedicalShop(String medicineName,double price,int quantity)
	{
		this.medicineName=medicineName;
		this.price=price;
		this.quantity=quantity;
	}
	
	void printDetails()
	{
		System.out.println(this.medicineName);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	
	double getTotalPrice()
	{
	  double temp=this.price*this.quantity;
     System.out.println(this.medicineName +" total"+temp);
return temp;	 
	}
}