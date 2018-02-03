import java.lang.StringBuffer;

public class StringDiff
{	
	public static String A  = "UNITED NATIONS — ";
	public static String B = "Training cEngland";
	
	public static int MISSING   = 1;
	public static int DIFFERENT = 10;
	
	public static void main(String args[])
	{
		float totalScore = calculateScores(A, B);
		
		System.out.println("-");
		System.out.println("total score: " + totalScore);
	}
	
	public static float calculateScores(String a, String b)
	{
		float score = 0;
		for(int i=0; i<a.length(); i++)
		{
			String c1 = a.substring(i,i+1);
			if(i<b.length())
			{
				String c2 = b.substring(i,i+1);
				
				if(!c1.equalsIgnoreCase(c2))
				{
					b = replace(b, c1, i);
					score+=DIFFERENT;
				}
			}
			else if(i>=b.length()) 
			{
				b+=c1;
				score+=MISSING;
			}
		}
		return score/(float)A.length();
	}
	
	public static String replace(String n, String k, int x)
	{
		return n.substring(0,x) + k + n.substring(x+1);
	}
}










