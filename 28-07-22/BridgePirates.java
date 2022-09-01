class BridgePirates
{
	public static void main(String [] args)
	{
		Bridge Pool=new Bridge();
		Pool.bridgeName="kandgul bridge";
		System.out.println("bridgeName="+Pool.bridgeName);
		Pool.bridgeInvestMent=4000000;
		System.out.println("bridgeInvestMent="+Pool.bridgeInvestMent);
		Pool.bridgeInKilloMeter=2.5d;
		System.out.println("bridgeInKilloMeter="+Pool.bridgeInKilloMeter);
		Pool.bridgeHeight=300;
		System.out.println("bridgeHeight="+Pool.bridgeHeight);
		Pool.whoOwnBridge="ganpati";
		System.out.println("whoOwnBridge="+Pool.whoOwnBridge);
		Pool.bridgewidth=50;
		System.out.println("bridgewidth="+Pool.bridgewidth);
		Pool.isItExpiredBridge=false;
		System.out.println("isItExpiredBridge="+Pool.isItExpiredBridge);
		Pool.durabilityInYears=300;
		System.out.println("durabilityInYears="+Pool.durabilityInYears);
		
	}
	
	
}