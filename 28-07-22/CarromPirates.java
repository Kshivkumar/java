class CarromPirates
{
	public static void main (String [] args)
	{
		Carrom carromGame=new Carrom();
		carromGame.carromBoard=true;
		System.out.println("carromBoard:"+carromGame.carromBoard);
		carromGame.totalCoins=18;
		System.out.println("totalCoins:"+carromGame.totalCoins);
		carromGame.carromBoardLength="74.74";
		System.out.println("carromBoardLength:"+carromGame.carromBoardLength);
		carromGame.carromSize=29;
		System.out.println("carromSize:"+carromGame.carromSize);
		
		System.out.println("=================1st=======================");
		
		Carrom carromGame1=new Carrom(60,"56.56",33);
	    System.out.println("carromBoard:"+carromGame.carromBoard);
        System.out.println("totalCoins:"+carromGame1.totalCoins);
		System.out.println("carromBoardLength:"+carromGame1.carromBoardLength);
		System.out.println("carromSize:"+carromGame1.carromSize);
		
		System.out.println("=================2nd=======================");
		
		Carrom carromGame2=new Carrom(42,"46.46",31);
	    System.out.println("carromBoard:"+carromGame.carromBoard);
        System.out.println("totalCoins:"+carromGame2.totalCoins);
		System.out.println("carromBoardLength:"+carromGame2.carromBoardLength);
		System.out.println("carromSize:"+carromGame2.carromSize);
		
		System.out.println("=================3rd=======================");
		
		Carrom carromGame3=new Carrom(41,"50.50",34);
	    System.out.println("carromBoard:"+carromGame.carromBoard);
        System.out.println("totalCoins:"+carromGame3.totalCoins);
		System.out.println("carromBoardLength:"+carromGame3.carromBoardLength);
		System.out.println("carromSize:"+carromGame3.carromSize);
		
		System.out.println("=================4th=======================");
		
		Carrom carromGame4=new Carrom(41,"50.50",34);
	    System.out.println("carromBoard:"+carromGame.carromBoard);
        System.out.println("totalCoins:"+carromGame4.totalCoins);
		System.out.println("carromBoardLength:"+carromGame4.carromBoardLength);
		System.out.println("carromSize:"+carromGame4.carromSize);
	}
	
}