//*BusStop : stopName(String),startingPoint(String),endPoint(String),totalBench(int),passengerNames(String[]),timeOfArrival(double[])
//* properties init using methods
 //properties init using constructor
//printData();

class BusStop
{
	String stopName;
	String startingPoint;
	String endPoint;
	int totalBench;
	String[] passengerNames;
	double [] timeOfArrival;
	
	BusStop(String stopName,String startingPoint,String endPoint,int totalBench)
	{
		//this.stopName=stopName;
		this.startingPoint=startingPoint;
		this.endPoint=endPoint;
		this.totalBench=totalBench;
	}
	void setpassengerNames(String []passengerNames)
	{
		this.passengerNames=passengerNames;
	}
	void settimeOfArrival(double[] timeOfArrival)
	{
		this.timeOfArrival=timeOfArrival;
	}
	void printData()
	{
	for(int bat=0;bat<this.passengerNames.length;bat++)
	{
		System.out.println(this.passengerNames[bat]);
	}
	for(int ball=0;ball<this.timeOfArrival.length;ball++)
	{
		System.out.println(this.timeOfArrival[ball]);
	}
       System.out.println(this.stopName);
       System.out.println(this.startingPoint);
       System.out.println(this.endPoint);	
       System.out.println(this.totalBench);	
       //System.out.println(this.passengerNames);
       //System.out.println(this.timeOfArrival);	 
	}	   
}
	
