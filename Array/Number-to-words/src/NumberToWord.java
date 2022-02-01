import java.util.Scanner;

public class NumberToWord {
	static String []x= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String []y= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static void convert(int num)
	{
		if(num>=1 && num<=19)
		{
			System.out.print(x[num]+" ");
		}
		if(num>=20 && num<=99)
		{
			System.out.print(y[num/10]+""+x[num%10]);
		}
		if(num>=100 && num<=999)
		{
			convert(num/100);
			System.out.print("Hundread ");
			convert(num%100);
				
		}
		if(num>=10000 && num<=99999)
		{
			convert(num/10000);
			System.out.print("Lakh ");
			convert(num%10000);
				
		}
		if(num>=1000 && num<=9999)
		{
			convert(num/1000);
			System.out.print("Thousand ");
			convert(num%1000);
				
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		if(num>=100000 && num<=999999)
		{
			convert(num/100000);
			System.out.print("Crore ");
			convert(num%100000);
				
		}
		
		else {
		convert(num);
		}
		sc.close();
	}

}
