package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8;
		int num1=0;
		int num2=1;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			
		}

	}

}
