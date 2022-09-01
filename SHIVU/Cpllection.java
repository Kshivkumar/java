class collection
{
public static void main(String[] name)
{
	int name1=name.length;
	if(name1>=4)
    System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	System.out.println(name[3]);
	int i=Integer.parseInt(name[4]);
	System.out.println(i);
	if(i>18)
	{
		System.out.println("elgible for voting");
	}
	if(i>21)
	{
		System.out.println("elgible for marriage")
	}
}

}