package week3.day2.Assignment_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find_Second_Largest_Number 
{
	public static void main(String[] args) 
	{
		int[] data= {3,2,11,4,6,7};
		List<Integer> largeNum=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			largeNum.add(data[i]);
		}
		Collections.sort(largeNum);
		Collections.reverse(largeNum);
		System.out.println("The sorted numbers are "+largeNum);
		System.out.println("The largest number are "+largeNum.get(1));
	}
}
