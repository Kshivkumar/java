class JailPirates
{
public static void main(String [] details)
{
Jail jail=new Jail("central jail",89);
jail.setNoOfGates(6);
String[] staf={"shiva","ganpati"};
jail.setStaffNames(staf);
jail.printData();

}

}