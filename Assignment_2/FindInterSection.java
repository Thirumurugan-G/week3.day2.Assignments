package week3.day2.Assignment_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindInterSection 
{
	public static void main(String[] args) 
	{
		int[] a= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		Set<Integer> a1=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length-1;i++)
		{
			a1.add(a[i]);			
		}
		for(int j=0;j<b.length-1;j++)
		{
			if(a1.contains(b[j]))
			{
				System.out.print(b[j]+" ");
			}
		}
	}
}
