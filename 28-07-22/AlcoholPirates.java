class AlcoholPirates
{
	public static void main (String [] args)
	{
 Alcohol alcohols=new Alcohol("vijay mallya",185);
 //alcohols.brandOwner=
 System.out.println("brandOwner:"+alcohols.brandOwner);
//alcohol.brandName="kingFisher";
 System.out.println("priceOfAlcohol:"+alcohols.priceOfAlcohol);
// alcohol.license=true;
// System.out.println("==============1st=============");
 
 Alcohol alcohols1=new Alcohol(120,true);
 System.out.println("alochol have a lots of containt:"+120);
 System.out.println("alocohol license found easily:"+true);
 
// System.out.println("==============2nd=============");

  Alcohol alcohols2=new Alcohol("ganesh",1285);
   System.out.println("brandOwner:"+alcohols2.brandOwner);
 System.out.println("priceOfAlcohol:"+alcohols2.priceOfAlcohol);
 
  //System.out.println("==============3rd=============");

  Alcohol alcohols3=new Alcohol(108,true);
   System.out.println("alochol have a lots of containt:"+108);
 System.out.println("alocohol license found easily:"+true);

 
   Alcohol alcohols4=new Alcohol("kali",880);
System.out.println("brandOwner:"+alcohols4.brandOwner);
 System.out.println("priceOfAlcohol:"+alcohols4.priceOfAlcohol);
  
 // System.out.println("==============4th=============");

  
   Alcohol alcohols5=new Alcohol(105,true);
   System.out.println("alochol have a lots of containt:"+105);
 System.out.println("alocohol license found easily:"+true);
 
 
   //System.out.println("==============5th=============");

	}


}