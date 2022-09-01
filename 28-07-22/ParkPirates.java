class ParkPirates
{
public static void main (String [] args)
{
	Park Garden=new Park();
	
	Garden.parkName="BARID SHAHI GARDEN";
	
	Garden.parkLocation="Shivnagar";
	
	Garden.noOfEntry=2;
	
	Garden.noOfChairs=190;
	
	Garden.parkOpenTime= 4;
	
	Garden.acceptFees=true;
	
	Garden.noOfPlayingEquipments=40;
	
	Garden.isFreeToWalk=true;
	
	
	System.out.println("parkName="+Garden.parkName);
	
	
	System.out.println("parkLocation="+	Garden.parkLocation);
	
	System.out.println("noOfEntry="+Garden.noOfEntry);
	
	System.out.println("noOfChairs="+ Garden.noOfChairs);
	
	System.out.println("parkOpenTime="+Garden.parkOpenTime);
	
	System.out.println("acceptFees="+Garden.acceptFees);
	
	System.out.println("noOfPlayingEquipments="+Garden.noOfPlayingEquipments);
	
	System.out.println("isFreeToWalk="+Garden.isFreeToWalk);
}

}