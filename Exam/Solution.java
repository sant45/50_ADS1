import java.util.Scanner;
class Node
{
	int data;
	Node next;
	public Node(int d)
	{
		data=d;
		next=null;
	}
}
class list
{
	Node head;
	list()
	{
		head=null;
	}
public void EnterNode(int d,int l)
{
	Node n=new Node(d);
	if(head==null)
		head=n;
	else{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}

		temp.next=n;
		}
}
public void display()
{
	Node temp=head;
	while(temp!=null)
		{
		System.out.print(temp.data);
		temp=temp.next;
		}
}
}
public class Solution {
	static list x=new list();	
	public static void LinkedListnumbertodigits(String s)
	{
		int l=s.length();
		int a=Integer.parseInt(s);
		while(a!=0)
		{
			int d1=a%10;
			a=a/10;
			x.EnterNode(d1,l); 
		}
	}
	public static void LinkedLisaddLargeNumbers(String s,String s1)
	{
		int l=s.length();
		int l1=s1.length();
		int a=Integer.parseInt(s);
		int a1=Integer.parseInt(s1);
		if(l1>l)
		{
		int stack[] =new int[l1+1];
		}
		else {
			int stack[]=new int[l+1];
		}
		
		}
	public static void main(String[] args)
	{
		
		String s;	
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		switch(input)
		{
		case "numberToDigits":
		{
		String p=sc.nextLine();
		String q=sc.nextLine();
		LinkedListnumbertodigits(p);
		LinkedListnumbertodigits(q);
		}
		break;
		case "addLargeNumbers":
		{
		String p=sc.nextLine();
		String q=sc.nextLine();
		}
		break;
		}
		x.display();
	}
}
