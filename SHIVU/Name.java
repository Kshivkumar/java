class Name
{
	static String getFullName(String firstName,String lastName)
	{
		String start=firstName;
		String end=lastName;
		String space=" ";
		String startName=start+space+end;
		return firstName;
	}
	static String getFullNameAbbreviation(String firstName,String lastName,boolean male)
	{
		String space="";
		String fullName=firstName+space+lastName;
		if (male)
		{
			String abbreviation="Mr.";
			fullName=abbreviation+fullName;
		} else
		{
			String abbreviation="Ms.";
			fullName=abbreviation+fullName;
		}
		return fullName;
		
		}
		
		
		
	
}