class BusStopPirates
{
public static void main(String [] details)
{
	BusStop busstop=new BusStop("mico layout","sarjapura","banashankari",7);
	//busstop.stopName();
	//busstop.startingPoint();
	//busstop.endPoint();
	//busstop.totalBench();
	
	String[] passenger={"shiva","ganpati","nikhil","basu","sandhya"};
	busstop.setpassengerNames(passenger);
	double[] timing={9};
	busstop.settimeOfArrival(timing);
	busstop.printData();
	
}

}