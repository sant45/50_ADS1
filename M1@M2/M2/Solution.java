
import java.util.Scanner;
public class Solution{
		public static   void main(String[] args)
	{
		System.out.println("Enter grid size");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       Percolation p =new Percolation(n);
       //p(n);
	System.out.println("Enter number of open sites");
	int n1=sc.nextInt();
      // System.out.println("Enter values of row and coloumn");
	int r,c;
	for(int i=0;i<n1;i++)
	{
	 System.out.println("Enter values of rows and column");
	 r=sc.nextInt();
	 c=sc.nextInt();
	 p.open(r-1,c-1);
	
	 }
	 p.print();
	 p.per();
	}
    	
		 
	}


