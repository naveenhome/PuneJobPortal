package csd.pune;

import org.junit.Before;

import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestLargest extends TestCase{
	
	Largest1 large;
	
	public void testCase1()
	{
		int [] arr={5,4,3,6,8,9,1};
		Largest obj=new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testCase2()
	{
		int [] arr={8,4,3,6,8,1};
		Largest obj=new Largest();
		assertEquals(8, obj.find(arr));
	}
	public void testCase3()
	{
		int [] arr={-5,-4,-3,-6,-8,-1};
		Largest obj=new Largest();
		assertEquals(-1, obj.find(arr));
	}
	
	public void testMock()
	{
		large = mock(Largest1.class);
		int[] arr1={2,9,3};
		when(large.find(arr1)).thenReturn(9);
		assertSame(9, large.find(arr1));
	}
	
	
}
