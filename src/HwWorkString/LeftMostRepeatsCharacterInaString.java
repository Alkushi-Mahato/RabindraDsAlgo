package HwWorkString;

import java.util.Arrays;

public class LeftMostRepeatsCharacterInaString {
	
	static char findRepeatChar(String s)
	{
		  char result = 0;
	      int[] arr = new int[256];
	       Arrays.fill(arr, 0);
	       int k=0;
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]++;;
		}
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>k)
			{
				k = arr[i];
				result = (char)i;
			}
		}
		
		return (char)result;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findRepeatChar("Hellow Rabindra -------- Mohanta"));
	}

}
