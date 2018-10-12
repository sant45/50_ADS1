import java.util.Scanner;

class Solution
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] d=str.split(" ");
		Stack st=new Stack(d.length);
	int sol=0;
		for(int i=0;i<d.length;i++)
		{
			String s=d[i];
		
				switch(s)
				{
				case "+":
					int a=st.pop();
					int b=st.pop();
					sol=a+b;
					st.push(sol);
					break;
				case "*":
					a=st.pop();
					b=st.pop();
					sol=a*b;
					st.push(sol);
					break;
				default :
					int e=Integer.parseInt(s);
					st.push(e);
					
				}
				
			}
				
		System.out.println(sol);
	}
}
class Stack
{
	int N=0;
	int [] s;
	public Stack(int cap)
	{
		s=new int[cap];
	}
	public boolean isEmpty()
	{
		return N==0;
	}
	public void push(int a)
	{
		s[N++]=a;
	}
	public int pop()
	{
		int b=s[--N];
		return b;
	}
	public boolean isFull()
	{
		return N==s.length;
	}
	public int peek()
	{
		return s[N];
	}
}