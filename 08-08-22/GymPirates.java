class GymPirates
{
public static void main(String [] args)
{
	
	
	Trainer trainer=new Trainer("shiv",7676067583l,23,Gender.MALE);
	
	String [] equip={"dumble","leg press machine","barbells","trademill","roller","free weight"};
	Gym gym=new Gym("cult fit",2000,equip);
	gym.printData();
	trainer.setExp(4);
	trainer.printData();
	
	
	
	
}

}