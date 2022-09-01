//Hospital: name,specialization(enum),equipments([]),
//consultationFees,Founder
//printData();-->this.founder.printData();

//Founder : name,from,profession(enum with String const),since,alive,income
//printData();

class Hospital
{
	String name;
	String[] equipments;
	int consultationFees;
	String founder;
	
	Hospital(String name,int consultationFees)
	{
		this.name=name;
		this.consultationFees=consultationFees;
	}
	void setEquipMents(String[] equipments)
	{
		this.equipments=equipments;
	}
	void setFounder(String founder)
	{
		this.founder=founder;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.consultationFees);
		System.out.println(this.equipments);
		System.out.println(this.founder);
	}
	
}