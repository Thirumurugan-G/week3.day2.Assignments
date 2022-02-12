package week3.day2.Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		String text= "We learn java basics as part of java sessions in java week1";
		int count;
		String[] split=text.split(" ");
		List<String> original=new ArrayList<String>();
		for(int i=0;i<=split.length-1;i++)
		{
			count=1;
			original.add(split[i]);
			for(int j=i+1;j<split.length;j++)
			{
				if(split[j].equals(split[i]))
				{
					count++;
				}
				if(count>1)
				{
					original.remove(split[j]);
				}
			}
		}
		System.out.println(original);
	}
}
