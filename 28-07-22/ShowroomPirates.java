class ShowroomPirates
{
  public static void main(String [] args)
  {
	  Showroom maruti=new Showroom();
	  maruti.camera=true;
	  System.out.println("camera:"+maruti.camera);
	  maruti.name="tata";
	  System.out.println("name:"+maruti.name);
	  maruti.place="bidar";
	  System.out.println("place:"+maruti.place);
	  maruti.noOfCars=40;
	  System.out.println("noOfCars:"+maruti.noOfCars);
	  
	  System.out.println("===================1st instances============================");
	  
	   Showroom maruti2=new Showroom("kia","bidar",25);
	   System.out.println("camera:"+Showroom.camera);
	   System.out.println("name1:"+maruti2.name);
	   System.out.println("place1:"+maruti2.place);
	   System.out.println("noOfCars:"+maruti2.noOfCars);
	   
	   System.out.println("====================2nd instance=======================");
	   
	   Showroom maruti3=new Showroom("toyata","hyderabad",45);
	   System.out.println("camera:"+Showroom.camera);
	   System.out.println("name2:"+maruti3.name);
	   System.out.println("name2:"+maruti3.place);
	   System.out.println("name2:"+maruti3.noOfCars);
	   
	   System.out.println("=====================3rd instance===================");
	   
	   Showroom maruti4=new Showroom("honda","gulbarga",30);
	   System.out.println("camera:"+Showroom.camera);
	   System.out.println("name3:"+maruti4.name);
   	   System.out.println("name3:"+maruti4.place);
	   System.out.println("name3:"+maruti4.noOfCars);
	   
	   System.out.println("=====================4th instance================");
       
       Showroom maruti5=new Showroom("bmw","pune",40);
       System.out.println("camera:"+Showroom.camera);
       System.out.println("name4:"+maruti5.name);
       System.out.println("name4:"+maruti5.place);
       System.out.println("name4:"+maruti5.noOfCars);

      System.out.println("=================5th instance================");	   
  }

}