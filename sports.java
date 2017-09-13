import java.util.*;

public class sports {

	String getName(){
		return "Generic Sports";
	}
	
	void getNumberOfTeamMembers(){
		System.out.println("Each teams has n players on "+getName());
	}
	
}

class Soccer extends sports{
	@Override
	String getName(){
		return "Soccer Class";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each teams has 11 players on "+getName());
	}
}

