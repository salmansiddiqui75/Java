
public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9};
		int even=0,odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}	
		System.out.println("Number of even is "+even);
		System.out.println("Number of odd  is "+odd);

	}

}
