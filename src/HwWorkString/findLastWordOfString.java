package HwWorkString;

public class findLastWordOfString {
	
	static int findLastCount(String s)
	{
		int size = 0;
		if(s.length()==0)
		{
			return -1;
		}
		
		for(int i=s.length()-1;i>0;i--)
		{
			if(s.charAt(i) == ' ')
			{
				break;
				
			}
			else
			{
				size++;
			}
		}
		
		return size;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findLastCount("Hellow Rabindra Moohanta"));
	}

}
