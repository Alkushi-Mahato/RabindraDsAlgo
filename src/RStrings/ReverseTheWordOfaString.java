package RStrings;

public class ReverseTheWordOfaString {
	
	static void reverseSingleWord(char[] result,int start,int end)
	{
		while(start<end)
		{
			char temp = result[start];
			result[start]=result[end];
			result[end]=temp;
			start++;
			end--;
			
		}
	}
	static String reverse(String s)
	{

	     char[] result = s.toCharArray();
		int start=0;
		int end =0;
		for(int i=0;i<result.length;i++)
		{
			 end=i;
			if(result[i]==' ')
			{
			
				reverseSingleWord(result,start,end-1);
				start=i+1;
				
			}
		}
	
		reverseSingleWord(result,start,end-1);
		reverseSingleWord(result,0,result.length-1);
		
		return new String(result);
	}
	
	public static void main(String[] args)
	{
		String a ="Hellow  nihele kobe kudmali kohobe joldi kohe";
		String b = reverse(a);
		System.out.println(b);
	}

}
