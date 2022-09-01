class Carrom
{
     static  boolean carromBoard=true;
	 byte totalCoins;
	 String carromBoardLength;
	 double  carromSize;
	 
	 
     Carrom()
	 {
		 System.out.println("carrom details");
	 }
	 Carrom(byte totalCoins1,String carromBoardLength1,double carromSize1)
     {
		 totalCoins=totalCoins1;
		 carromBoardLength=carromBoardLength1;
		 carromSize=carromSize1;
	 }
}