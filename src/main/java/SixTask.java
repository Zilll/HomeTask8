import java.util.Scanner;

import static java.lang.Integer.sum;
public class SixTask {
public static void main(String[] args) {
	int n,s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	n= (int) sc.nextLong();
	s=getEvenDigitSum(n);
	System.out.println("Sum of digits of a number is "+s);
}
	public static int getEvenDigitSum(int num){
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

	}
