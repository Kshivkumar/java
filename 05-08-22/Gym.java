class Gym
{
	String name;
	double fees;
	String [] equipments;
	
	
	Gym(String name,double fees,String[] equipments)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
	}
	void printData()
	{
	System.out.println(this.name);
	System.out.println(this.fees);
	for(int ring=0;ring<this.equipments.length;ring++)
	{
		System.out.println(this.equipments[ring]);
	}	
	}
	
	
}