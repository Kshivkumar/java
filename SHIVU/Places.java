//?? ticketPrice(String place), return price based on price 
//Least 10 places "

class Places
{
	 static int ticketPrice(String place)
	 {
		 if(place=="kedarnath")
		 {
			 System.out.println(50000);
			 return 50000;
		 }
	 
	       if(place=="bhavneshwar")
		 {
			 System.out.println(20000);
			 return 20000;
		 }
		 if(place=="goa")
		 {
			 System.out.println(80000);
			 return 80000;
		 }
		 if(place=="nepal")
		 {
			 System.out.println(100000);
			 return 100000;
		 }
		 if(place=="thailand")
		 {
			 System.out.println(170000);
			 return 170000;
		 }
		 if(place=="delhi")
		 {
			 System.out.println(25000);
			 return 25000;
		 }
		 if(place=="bhutan")
		 {
			 System.out.println(225000);
			 return 225000;
		 }
		 if(place=="USA")
		 {
			 System.out.println(900008 );
			 return 9000008;
		 }
		 if(place=="singapore")
		 {
			 System.out.println(20000);
			 return 20000;
		 }
		 if(place=="tirupati")
		 {
			 System.out.println(15000);
			 return 15000;
		 }
		 if(place=="shirdi sai baba")
		 {
			 System.out.println(15000);
			 return 15000;
		 }
		 System.out.println("INVALID");
		 return 0;
	 }
	 
	 public static void main(String[] args)
	 {
		Places.ticketPrice("gf"); 
	 }
	 
	 
}