class PrimeMinister{
  public static void main(String[] india){
   String[] listOfPrimeMinisters={"NarendraModi","ManmohanSingh","AtalBiharVajpayee","InderKumarGujral","HD DeveGowda","PV Narsimha","Chandrashekar","Vishwanath Pratap Singh","Lal Bahaddur Shastri","Rajive Gandi"};
   for (int i=0;i<listOfPrimeMinisters.length;i++)
   {
	   
	   System.out.println("index:"+i+"\n"+listOfPrimeMinisters[i]);
   }
	   
	   listOfPrimeMinisters[4]="NA";
	   listOfPrimeMinisters[7]="NA";
	   listOfPrimeMinisters[9]="NA";
	   
	   for (int s=0;s<listOfPrimeMinisters.length;s++)
	   {
		   System.out.println("index:"+s+"\n"+listOfPrimeMinisters[s]);
	   }
   
  }
}