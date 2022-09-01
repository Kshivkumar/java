class Dates{
		int day;
        int month;
        int year;
        String days;
		Dates(){
			System.out.println("__________");
			System.out.println("inside no argument constructer");
		}
		Dates(int day){
			this();
			System.out.println("__________");
			System.out.println("int constructer exuited");
			//this.day=day;
		}
		Dates(int day,int month){
			this(day);
			System.out.println("__________");
			System.out.println("int int constructer exuited");
			this.month=month;
			//this.day=day;

		}
		Dates(int day,int month,int year){
			this(day,month);
			System.out.println("__________");
			System.out.println("int int int constructer exuited");
			this.year=year;
			//this.day=day;

		}
		Dates(int day,int month,int year,String days){
			this(day,month,year);
			System.out.println("__________");
			System.out.println("int int int String constructer exuited");
			this.days=days;
		}





}