package com.hcl.exercise4;

public class App 
{
	public int[] sort(int[] n)
	{
		int i,j,temp=0;
		for(i=0; i<n.length; i++)
		{
			for(j=0; j<n.length; j++)
				if(n[i]<=n[j])
					{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					}
		}
	
		
		return n;
	
	}



}
