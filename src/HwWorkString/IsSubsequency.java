package HwWorkString;

public class IsSubsequency {
	static boolean isSubsequency(String s,String s1)
	{
		if(s.length()==0 || s1.length()==0)
		{
			return false;
		}
		int n = s.length();
		int m = s1.length();
		int i=0,j=0;
		
		
		while(i<n && j<m)
		{
			if(s.charAt(i) == s1.charAt(j))
			{
				j++;
			}
			i++;
		}
		
		if(j==m)
		{
			return true;
		}
		
		
		return false;
	}
	public static void main(String[] args)
	{
		String s = "Rabindra Mohanta Kon Khobar";
		String s1 = "aaKonKho";
	     System.out.println(isSubsequency(s,s1));
	}

}
