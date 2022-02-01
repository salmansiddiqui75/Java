
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {1,2,3,4,5,6,7};
		int []y=new int[x.length];
		for(int i=x.length;i>1;i--)
		{
			//to copy value of x into y
			y[i]=x[i];
		}
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}

	}

}
