package RStrings;

import java.util.Arrays;

public class Anagram {
	//time complexity isO(nlogn)
	static Boolean isAnagram(String a,String b)
	{
		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		
	         
		for(int i=0;i<aChar.length;i++)
		{
			if(aChar[i]!=bChar[i])
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	//timeComplexity (O(n)
	
	static boolean findAnagram(String a,String b)
	{
		int[] array = new int[256];
		for(int i=0;i<a.length();i++)
		{
			array[a.charAt(i)]++;
		}
		for(int i=0;i<b.length();i++)
		{
			array[b.charAt(i)]--;
		}
		
		for(int e:array)
		{
			if(e!=0)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args)
	{
		String e = "rabsi";
		String f = "rabi";
		System.out.println(findAnagram(e,f));
	}

}
