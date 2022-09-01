//"??? ticketAvailable(int tickets) , tickets > 2 ,NA 
//tickets <2 , AVAIL or if tickets < 0 , INVALID


class Airport
{
	public static String ticketAvailable(int tickets)
	{ 
		if (tickets>2)
		{
		System.out.println("NA");
		return "NA";
		}
		if (tickets<2 && tickets > 0)
		{
			System.out.println("AVAIL");
			return "AVAIL";
		}
		if (tickets<0)
		{
			System.out.println("INVALID");
			return "INVALID";
		}
		return "";

	}



   public static void main(String[] args)
   {
	   Airport.ticketAvailable(1);
    
   }  
	   
   
}