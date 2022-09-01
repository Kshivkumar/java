class Ten
{
	public static void main(String [] args)
	{
		long a=Byte.valueOf((byte)10);
		System.out.println(a);
		int b=Byte.valueOf((byte)15);
		System.out.println(b);
		byte c=Byte.valueOf("12");
		System.out.println(c);
		//byte d=Byte.valueOf("rat",13);
		//System.out.println(d);
		int e=Byte.hashCode((byte) 52);
		System.out.println(e);
		//byte f=Byte.decode("2154");
		//System.out.println(f);
		int g=Byte.compare((byte) 4, (byte) 5);
		System.out.println(g);
		//byte h=Byte.parseByte("Small");
		//System.out.println(h);
		//byte i=Byte.parseByte("Small", 5);
		//System.out.println(i);
		String j=Byte.toString((byte) 8);
		System.out.println(j);
		char z=Byte.getDirectionality('a');
		System.out.println(z);
		
	}
}