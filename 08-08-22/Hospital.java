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
	Founder founder;
	Specialization specialization;
	
	Hospital(String name,int consultationFees,Specialization specialization)
	{
		this.name=name;
		this.consultationFees=consultationFees;
		this.specialization=specialization;
	}
	void setEquipMents(String[] equipments)
	{
		this.equipments=equipments;
	}
	void setFounder(Founder founder)
	{
		this.founder=founder;
	}
	void printData()
	{
		System.out.println("name of the hospital is="+this.name);
		System.out.println(" the consultancy fee is="+this.consultationFees);
		System.out.println("the specializationof hospital="+this.specialization);
		for (int insta=0;insta<this.equipments.length; insta++)
		{
			System.out.println(this.equipments[insta]);
		}
		
		//System.out.println(this.Specialization);
	}
	
}