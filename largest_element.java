package Kiran_Largest_Element;
import java.util.Scanner;

public class largest_element {

	public static int [] locateLargest (double [][] a)
	{
		
		int [] arrys = new int[2];
		double [][] b = a;
		double max_element=b[0][0];
		
		for(int i=0;i<b.length;i++)//b.length gives the no of rows in the 2d array
		{
			for(int j=0;j<b[0].length;j++)//b[0].length gives the no of columns
			{
				if (max_element <= b[i][j])
				{
					max_element = b[i][j];
					arrys[0]=i;
					arrys[1]=j;
				}
			}
		}
		
		
		
		return arrys;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;//m is no of rows, n is no of columns.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array");
		m = sc.nextInt();
		n = sc.nextInt();
		
		double [][]a=new double[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		int [] largestelement = locateLargest(a);
		System.out.println("The Location of the largest element is at " +"("+ largestelement[0]+","+largestelement[1]+")");
		sc.close();

	}

}
