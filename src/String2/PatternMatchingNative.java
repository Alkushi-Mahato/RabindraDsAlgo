package String2;

public class PatternMatchingNative {
	
	//time complexity is O(n.m.)
	static void SearchString(String s,String a)
	{
		for(int i=0;i<=s.length()-a.length();i++)
		{
			int j=0;
			for(;j<a.length();j++)
			{
				if(s.charAt(i+j) != a.charAt(j) )
				{
					break;
				}
			}
			if(j==a.length())
			{
				System.out.println("String is Present At : "+i);
			}
		}
	}
	
	public static void main(String[] args)
	{
	     SearchString("kudumi Rabindra Tiduar Tiduar","Tiduar");
	}

}
