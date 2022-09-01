class MedicalShopPirates{


public static void main(String[] values)
{
	
	MedicalShop medicalShop=new MedicalShop("Dolo 65",1.65D,10);
	medicalShop.printDetails();
	double total=medicalShop.getTotalPrice();
	System.out.println(total);
}

}