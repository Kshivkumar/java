// write a program and declare array of char's store all characters in small case
//1.access all elements in forword direction
//2.access all elements in backword direction 

class Alphabates
{
   public static void main (String[] args)
   {
     char[] alphabates={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int s;
      for(s=0;s<=alphabates.length;s++)
	  {
		  System.out.println(alphabates[s]);
	  }		  
      int t;
	  for (t=0;t>=alphabates.length;t--)
	  {
		  System.out.println(alphabates[t]);
	  }
   }
	
}