class Jail
{
  String name;
  int noOfcells;
  String[] StaffNames;
  int noOfGates;
  
  
  Jail(String name,int noOfcells)
  {
	  
	 this.name=name;
     this.noOfcells=noOfcells;	 
  }
  void setNoOfGates(int noOfGates)
  {
	this.noOfGates=noOfGates; 
  }
  void setStaffNames(String[] StaffNames)
  {
	  this.StaffNames=StaffNames;
  }
  void printData()
  {
  for(int mobile=0;mobile<this.StaffNames.length;mobile++)  
  {
	 System.out.println(this.StaffNames[mobile]);
	 
	 
  }
  
  System.out.println(this.name);
  System.out.println(this.noOfcells);
  System.out.println(this.noOfGates);
  }
}

