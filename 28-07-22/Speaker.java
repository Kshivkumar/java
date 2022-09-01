//Speaker

//4 properties 
//Declare two Constructor in each class 
//In Main method init all instance variable 
//Least one static property
//5 instances 
 
 
 class Speaker
 {
	 static boolean sound=true;
	 String speakerBrand;
	int typesOfSpeaker;
	 float SpeakerPrice;
	 boolean platformAvailability;
	 
	 
	 Speaker(String speakerBrand1,float SpeakerPrice1)
	 {
		 speakerBrand=speakerBrand1;
		 SpeakerPrice=SpeakerPrice1;
		 System.out.println("information about speaker");
	 }
	 Speaker(boolean available1,int speakerTypes1)
	 {
	     //platformAvailability=available1;
	     //typesOfSpeaker=speakerTypes1;
		 System.out.println("spaeaker is available at"+platformAvailability);
		 System.out.println("types of speaker are:"+typesOfSpeaker);
	 }
 }
 