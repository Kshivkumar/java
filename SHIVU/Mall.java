class Mall{
	static void mallDetails(String mallName){
		System.out.println(mallName);
	}
	static void mallDetails(int noOfFloors,String[] names){
		System.out.println(noOfFloors);
		for (int i=0;i<names.length; i++){
			System.out.println(names[i]);
		}
	}
	static void mallDetails(String name,double ratings){
		System.out.println(name);
		System.out.println(ratings);
	}
	static void mallDetails(String name,long contactNo,String email){
		System.out.println(name);
		System.out.println(contactNo);
		System.out.println(email);
	}
	static void mallDetails(int pinCode,String location){
		System.out.println(pinCode);
		System.out.println(location);
	}
	static void mallDetails(String[] products,double[] prices){
		for(int s=0;s<products.length;s++){
			System.out.println(products[s]);
		for(int t=0;t<prices.length;t++){
			System.out.println(prices[t]);
			
		} 	
		}
	}
}