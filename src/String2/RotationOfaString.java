package String2;

public class RotationOfaString {
	
	static boolean isContains(String s,String s1)
	{
		int m = s.length();
		int n = s1.length();
		
		int j=0;
		
		for(int i=0;i<=(m-n);i++)
		{
			for( j=0;j<n;j++)
			{
				if(s.charAt(i+j)!=s1.charAt(j))
				{
					 break;
				}
			}
			
			if(j==n)
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	static boolean isRotation(String s,String s1)
	{
		if(s.length()!=s1.length())
		{
			return false;
		}
		String doubleStr = s+s;
		
		return isContains(doubleStr,s1);
	}
	
	
	public static void main(String[] args)
	{
	       String s = "kamarin";
	       String s1 = "maarinka";
	       System.out.println(isRotation(s,s1));
	}

}
