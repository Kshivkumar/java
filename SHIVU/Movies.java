//1 write a program and declare array and store 10 elements of movie data 
//a.access all elements and display it in reverse order

class Movies{
  public static void main(String[] arg)
  {
	String[] Movies={"agneepath","spider Man","Thor","Captain America","Aquaman","Fantastic Beast","War","Storm","top Gun","Ambulance" };
   System.out.println("Reverse Order");
    for(int i=Movies.length-1;i>=0;i--)
	{
		System.out.println(Movies[i]);
	}		
	 
  }
}