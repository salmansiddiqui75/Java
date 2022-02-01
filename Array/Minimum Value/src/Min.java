
public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {1,23,42,43,5,2,4345,563,646,24,3,56};
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(min>num[i])
				min=num[i];
		}
		System.out.println("Minimum number is "+min);

	}

}
