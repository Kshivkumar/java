class DatesPirates
{


public static void main(String[] test){
	Dates date=new Dates();
	date.day=1;
	date.month=2;
	date.year=2022;
	date.days="sunday";
	System.out.println(	date.day);
	System.out.println(	date.month);
	System.out.println(	date.year);
	System.out.println(	date.days);
	Dates date1=new Dates(3);
	date1.month=4;
	date1.year=2022;
	date1.days="sunday";
	System.out.println(	date1.day);
	System.out.println(	date1.month);
	System.out.println(	date1.year);
	System.out.println(	date1.days);
	Dates date2=new Dates(5,6);
	date2.year=2022;
	date2.days="sunday";
	System.out.println(	date2.day);
	System.out.println(	date2.month);
	System.out.println(	date2.year);
	System.out.println(	date2.days);
	Dates date3=new Dates(7,8,2022);
	date3.days="sunday";
	System.out.println(	date3.day);
	System.out.println(	date3.month);
	System.out.println(	date3.year);
	System.out.println(	date3.days);
	Dates date4=new Dates(7,8,2022,"monday");
	System.out.println(	date4.day);
	System.out.println(	date4.month);
	System.out.println(	date4.year);
	System.out.println(	date4.days);


}



}