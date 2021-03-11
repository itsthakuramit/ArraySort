package com.hcl.exercise4;

public class MainApp {

	public static void main(String[] args) {
		int[] arr= {-7,-1,7,9,4,3,2,2,5,3,8};
		
		App app= new App();
		int[] arr2= app.sort(arr);
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]);
		}
		
		
	}

}
