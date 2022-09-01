class WalletModify{
	public static void main(String[] materials){
		Wallet.brand("tommy hilfiger");
		Wallet.color("voilet +","brown");
		int a=4;
		int b=11;
		double c=0.81;
		Wallet.size(a,b,c);
		Wallet.usedMaterials("leather","cotton",70,true);
		Wallet.itemsInsideTheWallet("rupay",3,4200,8600,6);
	}
}