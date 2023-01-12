package String2;

public class RabinKarpAlgo {	
	static void search(String pattern,String text)
	{
		int m = pattern.length();
		int n = text.length();
		int d = 256;
		int q = 101;
		
		int i = 0;
		int j = 0;
		int l=1;
		//pattern hash value
		int e=0;
		//text hash value
		int f=0;
		
		for(i=0;i<m-1;i++)
		{
			l = (l*d)%q;
		}
		
		for(i=0;i<m;i++)
		{
		    e = (e+pattern.charAt(i)*d)%q;
		    f = (f+text.charAt(i)*d)%q;
		}
		for(i=0;i<=(n-m);i++)
		{
			if(e==f)
			{
				for(j=0;j<m;j++)
				{
					if(pattern.charAt(j)!=text.charAt(i+j))
					{
						break;
					}
				}
				
				if(m==j)
				{
					System.out.println("pattern is present at-->"+i);
				}
			}
			
			if(i<(n-m))
			{
				f = f-(text.charAt(i)*l);
	     		f = (f+text.charAt(i+m)*d)%q;	
	     		
//	     		if(f<0)
//	     		{
//	     			f = f+q;
//	     		}
			}
   
		}
		
		
	}
	public static void main(String[] args)
	{
		String rab = "Rabindra Mohanta Kudmi tiduarab";
		search("ta",rab);
		
	}

}
