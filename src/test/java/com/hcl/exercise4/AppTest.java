package com.hcl.exercise4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
    	App app= new App();
    	int[] array1= {7,5,9,1,0,5,3,6,2,7,};
    	int[] actual1= app.sort(array1);
    	int[] exp1 = {0,1,2,3,5,5,6,7,7,9};
    	assertArrayEquals(exp1, actual1);
    	
    	int[] array2= {10,-7,-1,5,6,0,9,8,0,2};
    	int[] actual2= app.sort(array2);
    	int[] exp2 = {-7,-1,0,0,2,5,6,8,9,10};
    	assertArrayEquals(exp2, actual2);;
    	
    	
    }
}
