class One
{
   public static void main(String[] args)//byte
   {
	 byte a=Byte.parseByte("24");
     System.out.println(a);	
     byte b=Byte.parseByte("35",24);
     System.out.println(b);	
     byte c=Byte.valueOf("12");
     System.out.println(c);	
	 int d=Byte.compare((byte)40,(byte)35);
	 System.out.println(d);
     byte e=Byte.decode("11");
     System.out.println(e);	
     byte f=Byte.parseByte("21",30);
     System.out.println(f);		 
	   
   }

}