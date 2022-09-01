//1.Create instance of string by calling all constructors 
//2. Invoke least 15 instance methods of String 
//3. Invoke least 5 static methods of String 


class InvokingConstructor
{
	public static void main(String [] args)
	{
		String string=new String();
		System.out.println(string);
		
		//String(byte[] bytes)
		byte[] bytes="welcome to java ".getBytes();    //converting byte to string 
		String string1=new String(bytes);
		System.out.println(string1);
		 
		 //String(byte[] bytes, Charset charset)
		 byte[] bytes1={65,66,67,68};
		 String string2=new String(bytes1);
		 System.out.println(string2);
		 
		 //String(byte[] bytes, int offset, int length)
		 String string3=new String(bytes1,1,2);
		 System.out.println(string3);
		 
		 //String(byte[] bytes, int offset, int length, String charsetName)
		 String string4=new String(bytes1,1,3,charset.forName("ASCII"));
		 System.out.println(string4);
		 
		 
		 //String(byte[] bytes, String charsetName)
		String string5=new String(bytes1,);
		 System.out.println(string5);
		 
		// String(char[] value)
		Char[] chars = { 'a', 'b', 'c', 'd', '\0', 'A', 'B', 'C', 'D', '\0' };
         String string6=new String(chars);
		System.out.println(String6); 
		
		//String(char[] value, int offset, int count)
		  Char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
         String string7=new String(charArray,1,3)
		 System.out.println(string7);
	}	
	
}