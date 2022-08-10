class Founder
{
    String name;
	String from;
	Profession profession;
	double since;
	boolean alive;
	long income;
	
	Founder(String name,String from,double since,Profession profession)
	{
		this.name=name;
		this.from=from;
		this.since=since;
		this.profession=profession;
	}
	void setIncome(long income)
	{
		this.income=income;
	}
	void setAlive(boolean alive)
	{
		this.alive=alive;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.from);
		System.out.println(this.since);
		System.out.println(this.profession.value);
		System.out.println(this.income);
		System.out.println(this.alive);
		
	}
	//this.founder.printData()

}