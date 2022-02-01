
public class Bubble {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {2,5,2,6,85,3,5,8,45};
		for(int i=0;i<num.length;i++)
		{
			for(int j=1;j<num.length-1;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}		
		}
		for(int n:num)
		{
			System.out.println(n);
		}
	}

}
