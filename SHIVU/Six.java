class Six
{
	public static void main(String[] args)//long
	{
		long a=Long.decode("23");
		System.out.println(a);
		long b=Long.getLong("45",4455656467l);
		System.out.println(b);
		long c=Long.valueOf(24579842l);
		System.out.println(c);
		int d=Long.compare(1145418746l,564511545l);
		System.out.println(d);
		long e=Long.getLong("1245l",1254623624l);
		System.out.println(e);
		long f=Long.valueOf("456",10);
		System.out.println(f);
		String g=Long.toBinaryString(134646413l);
		System.out.println(g);
		long h=Long.reverseBytes(221454261l);
		System.out.println(h);
		String i=Long.toOctalString(216546114l);
		System.out.println(i);
		int j=Long.signum(24649762l);
		System.out.println(j);
	}
}