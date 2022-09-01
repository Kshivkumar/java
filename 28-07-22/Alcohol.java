//Alcohol

class Alcohol
{
	static String brandName="king fisher";
	String brandOwner;
	double alcoholContaint;
	int priceOfAlcohol;
	boolean license=true;
	
	
	Alcohol(String brandOwner1,int priceOfAlcohol1)
	{
		//brandOwner1="vijayMallya";
		//priceOfAlcohol1=190;
		//System.out.println("brandOwner:"+brandOwner);
		//System.out.println("priceOfAlcohol:"+priceOfAlcohol);
		brandOwner=brandOwner1;
		priceOfAlcohol=priceOfAlcohol1;
		
		
		System.out.println("basic information of alcohol");
		
	}
	Alcohol(int alcoholContaint1,boolean license1)
	{
	
		alcoholContaint=alcoholContaint1;
		//priceOfAlcohol=priceOfAlcohol1;
		license=license1;
//System.out.println("alcoholContaint:"+alcoholContaint1);
		//System.out.println("license:"+license1);
		
	}	
}
