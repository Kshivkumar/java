class NamePirates
{
	public static void main(String[] getResult)
	{
		
		System.out.println(getResult[0]);
		System.out.println(getResult[1]);
		String fname=getResult[0];
		String lname=getResult[1];
		String fullName=Name.getFullName(fname,lname);
		System.out.println(fullName);
		
		
		boolean gender=true;
		fullName=Name.getFullNameAbbreviation(fname,lname,gender);
		System.out.println(fullName);
		
	}



}