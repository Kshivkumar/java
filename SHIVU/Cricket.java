class Cricket{
static void player(int noOfPlayer)
{
	System.out.println("no of players in the team"+noOfPlayer);
} 
static void player(String[] nameOfPlayer)
{
	for (int i=0;i<nameOfPlayer.length;i++){
		System.out.println("player:"+nameOfPlayer[i]);
	}
}
static void player(String nation)
{
	System.out.println("playing for nation:"+nation);
}
static void  player(int balls,int runs)
{
    System.out.println("played over is:"+balls);
    System.out.println("score is:"+runs);	
}
static void over(int wickets)
{
	System.out.println("wickets in 20 over:"+wickets);
	
}
static void  over(byte runouts)
{
	System.out.println("runout in 20 over:"+runouts);
}
}