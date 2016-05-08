package csd.pune;

public class Largest {

	public int find(int[] arr) {
		// TODO Auto-generated method stub
		
		int max=Integer.MIN_VALUE;
		for(int i=0;arr.length>i;i++)
		{
			if(max<=arr[i])
				max = arr[i];
		}
		
		return max;
	}

}
