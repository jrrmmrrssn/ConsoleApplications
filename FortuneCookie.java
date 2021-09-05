import java.util.Random;

public class FortuneCookie
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		String response = "";
		int i = 1 + r.nextInt(6);
		int a = 1 + r.nextInt(54);
		int b = 1 + r.nextInt(54);
		int c = 1 + r.nextInt(54);
		int d = 1 + r.nextInt(54);
		int e = 1 + r.nextInt(54);
		int f = 1 + r.nextInt(54);

		if ( i == 1 )
			response = "You will find happiness with a new love.";
		else if ( i == 2 )
			response = "You will have great financial fortune.";
		else if ( i == 3 )
			response = "Do not be afraid of competition. An exciting opportunity lies ahead of you. You love peace.";
		else if ( i == 4 )
			response = "Funny. A closed mouth gathers no feet. He who throws dirt is losing ground.";
		else if ( i == 5 )
			response = "Romantic. Paradise is always where love dwells. The one you love is closer than you think";
		else if ( i == 6 )
			response = "Respect yourself and others will respect you.";
		else
			response = "FORTUNE COOKIE ERROR";

		System.out.println("Fortune cookie says: " + response);
		System.out.println("     " + a + "-" + b + "-" + c + "-" + d + "-" + e + "-" + f );
	}
}