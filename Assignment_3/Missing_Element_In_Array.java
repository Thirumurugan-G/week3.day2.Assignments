package week3.day2.Assignment_3;

import java.util.Set;
import java.util.TreeSet;

public class Missing_Element_In_Array 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,7,6,8};
		Set<Integer> sort=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sort.add(arr[i]);
		}
		System.out.println("sorted array -> "+sort);
		for(int i=arr[0];i<arr.hashCode();i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println("missing element -> "+i);
				break;
			}
		}
	}
}
