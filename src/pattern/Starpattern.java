package pattern;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);;
	System.out.println("enter no");
	int row=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=row;j>i;j--)
		{
			System.out.print("_");
		}
		for(int k=0;k<i*2-1;k++)
		{
			System.out.print("*");
		}
		for(int l=row-1;l>=i;l--)
		{
			System.out.print("_");
		}
		System.out.println();
	}
	}

}
