class Nine
{
	public static void main(String [] args)
	{
		int a = Float.floatToIntBits(2.05f);
		System.out.println(a);
		float b = Float.intBitsToFloat(26554);
		System.out.println(b);
		boolean c = Float.isFinite(65.48f);
		System.out.println(c);
		boolean d = Float.isNaN(2f);
		System.out.println(d);
		int e = Float.floatToRawIntBits(29.05f);
		System.out.println(e);
		float f = Float.sum(2.4f, 8.9f);
		System.out.println(f);
		String g = Float.toHexString(13.54f);
		System.out.println(g);
		String h = Float.toHexString(17.5f);
		System.out.println(h);
		float i = Float.valueOf("1215");
		System.out.println(i);
		int j = Float.compare(5.2f, 25.1f);
		System.out.println(j);
	}
}