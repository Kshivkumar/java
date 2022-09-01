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
		System.out.println("founder of the hospittal="+this.name);
		System.out.println("hospital owner from="+this.from);
		System.out.println("hospital open since="+this.since);
		System.out.println("hospital main profession is="+this.profession.value);
		System.out.println("hospital montly income="+this.income);
		System.out.println("hospital owner alive="+this.alive);
		
	}
	//this.founder.printData()

}