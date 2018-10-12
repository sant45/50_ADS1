package pay;

import java.util.Scanner;

public class Solution {
	static int Top;
    static int n,i,n1;
    static String x;
    static char c,d;
	public  Solution(int n)
	{
		n=n;
	}
	static String Stack[]=new String[n];
	String s1[]=new String[100];
	public static void push(String s,int n)
	{
	 for(Top=0;Top<=n+1;Top++)
	 {
		 Stack[Top]=s;
		 
	 }
	 for(Top=0;Top<=n+1;Top++)
	 {
		x=Stack[Top];
		n1=x.length();
		for(i=0;i<n1;i++)
		{
			c="x".charAt(0);d="x".charAt(n);
			if(c=='{'||c=='['||c=='('&& d=='}'||d==']'||d==')')
			{
				System.out.println("True");
				
		}
			else
				System.out.println("false");
		}
	 }
	   
	}
	public static void main(String[] args)
{
		System.out.println("false");
	
	Scanner sc=new Scanner(System.in);
	Scanner xc=new Scanner(System.in);
	//int n=sc.nextInt();
	Solution p=new Solution(n);
      while(sc.hasNext())
	 {
    		int n=sc.nextInt();
		 String s=sc.nextLine();
		 
			 Solution.push(s,n);
			 
	}
}
	
}

