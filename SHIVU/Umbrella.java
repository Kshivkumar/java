class Umbrella{
	static void protectFromRain()
	{
		System.out.println("Avoid walking in the rain");
		open();
	}
    static void protectFromSun()
	{
		System.out.println("Wear a ton of sunscreen");
		open();
	}
	static void shut()
	{
		System.out.println("Shut the umbrella");
	}
	static void open()
	{
		System.out.println("Open the umbrella");
	}
	public static void main(String[] args)
	{
		protectFromRain();
		protectFromSun();
		shut();
	}
}