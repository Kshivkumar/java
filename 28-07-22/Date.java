//Date 
  //      int day;
   //     int month;
  //      int year;
    //    String day;

	
	class Date
	{
		int day;
		int month;
		int year;
		String days;
		
		
		Date()
		{
			System.out.println("----------------------------------");
			System.out.println("inside no argument constructer");
			
		}
		
		Date(int day)
		{
			this(int day);
			System.out.println("int costructor day");
			//this.day=day;
			
		}
		Date(int day,int month)
		{
		this(30);
		System.out.ptintln("default constructer day);
		System.out.println("dafault constructor monthd);
		//this.day=day;
		//month=month;	
		}
		Date(int day,int month,int year)
		{
			this(30,12);
			System.out.println("day");
			System.out.println("month");
			System.out.println("year");
			
		}
		Date(int day,int month,int year,int days)
		{
			this(30,12,"one year",30);
			System.out.println("day");
		    System.out.println("month");
            System.out.println("year");
			System.out.println("days");
		}
	}