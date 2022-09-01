//*Umbrella --> protectFromRain(),protectFromSun(),
//shut(),open()
//invoke open from protectFromRain()
////invoke open from protectFromSun()
//Invoke protectFromRain() of Umbrella from mai n method 
//Invoke protectFromSun() of Umbrella from main method 
//Invoke shut() of Umbrella from main method 


class Chhata
{
	static void protectFromRain()
	{
		System.out.println("barish se bacho");
		open();
	}
	static void protectFromSun()
	{
		System.out.println("dhoop se bacho");
		open();
	}
	static void shut()
	{
		System.out.println("chhata band karo");
	}
	static void open()
	{
		System.out.println("chhata open karo");
	}
}