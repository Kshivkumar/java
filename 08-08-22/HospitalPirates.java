class HospitalPirates
{
public static void main(String[] details)
{
	Hospital hospital=new Hospital("spandana hospital",500,Specialization.PSYCHAITRY);
	String[] equip={"patient monitor","surgical tables","steriizers","lights","ultrasound","blanket"};
	hospital.setEquipMents(equip);
	Founder founder=new Founder("SGK","BIDAR",1997,Profession.CATEGORY2);
	founder.setIncome(3500000l);
	founder.setAlive(true);
	hospital.printData();
	 founder.printData();
	
}

}