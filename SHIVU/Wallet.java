class Wallet{
	static void brand(String brand){
	System.out.println("brand of the wallet:"+brand);
	}
	static void color(String color1,String color2){
		System.out.println("wallet mixed color is"+color1+"and"+color2);
	}
	static void size(int length,int width,double thickness){
		System.out.println("wallet dimension is:"+length);
		System.out.println("wallet dimension is:"+width);
		System.out.println("wallet dimension is:"+thickness);
	}
	static void usedMaterials(String leather,String thread,long threadLength,boolean logo){
		System.out.println("used materials is:"+leather);
		System.out.println("used materials is:"+thread);
		System.out.println("length of the:"+threadLength);
		System.out.println("wallet front log:"+logo);
	}
	static void itemsInsideTheWallet(String cardType,int numberOfCards,long cash,long totalAmount,int cashDepartment){
		System.out.println("card type is:"+cardType);
		System.out.println("number of cards holding:"+numberOfCards);
		System.out.println("cash section:"+cash);
		System.out.println("number of holding amount:"+totalAmount);
		System.out.println("wallet department:"+cashDepartment);
	}
}
