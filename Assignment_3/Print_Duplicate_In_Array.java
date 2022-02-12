package week3.day2.Assignment_3;

import java.util.*;

public class Print_Duplicate_In_Array 
{
	public static void main(String[] args) 
	{
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		Set<Integer> orig=new LinkedHashSet<Integer>();
		Set<Integer> dup=new LinkedHashSet<Integer>();
		for(int j=0;j<arr.length;j++)
		{
			count=0;
			orig.add(arr[j]);
			for(int i=j+1;i<arr.length;i++)
			{
				if(orig.contains(arr[i]))
				{
					count++;
					if(count>0)
					{
						dup.add(arr[i]);
					}
				}
			}
		}
		System.out.println("duplicate value is ->"+dup);
	}
}
