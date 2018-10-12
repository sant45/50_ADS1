import java.util.Scanner;

class Nod{
	int  data;
	Nod next;
	Nod(int d)
	{
		data=d;
		next=null;
	}
}
class list
{
	Nod head;
	int c=0;
	list()
	{
		head=null;
	}
	public void pushleft(int d)
	{
		Nod n=new Nod(d);
		if(head==null)
		{
			head=n;
			c++;
		}
		else
		{
			n.next=head;
			head=n;
			c++;
		}
	}
	public void pushright(int d)
	{
		Nod n=new Nod(d);
		
		if(head==null)
		{
			head=n;
			c++;
		}
		else
		{
			Nod temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			c++;
		}
	}
	public int popleft()
	{
		if(head==null)
		{
			System.out.println("List is empty");
	}
		if(head.next==null)
		{
		head.next=head;	
		c--;
		}
		else
		{
			int d1=head.data;
			head=head.next;
			c--;
			return d1;
		
		}
		return -1;
	}
	public int popRight()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		if(head.next==null)
		{
			head=head.next;
		c--;
		}
		else
		{
			Nod temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			int d1=temp.next.data;
			temp.next=null;
			c--;
			return d1;
		}
		return -1;
	}
	public void display()
	{
		Nod temp=head;
		System.out.print("[");
		while(temp!=null)
		{
			System.out.print(temp.data);
			System.out.print(",");
			temp=temp.next;
		}
		System.out.print("]");
		System.out.print("\n");
	}
	public void size()
	{
		System.out.println(c);
	}
}
public class deque {
public static void main(String[] args)
{
	System.out.println("ssd");
	list p=new list();
	Scanner sc=new Scanner(System.in);
	Scanner xc=new Scanner(System.in);
	 int x=xc.nextInt();
	 //System.out.println(x);	
	while(sc.hasNext())
	{
		String s,m,n = null;
		s=sc.nextLine();
		int x1;
		String[] arrOfStr = s.split(" "); 
			 int s1=arrOfStr.length;
			m=arrOfStr[0];
			  if(s1>1)
			  n=arrOfStr[1];
			 
			  int v=Integer.parseInt(n);
			 switch(m) {
		case "pushLeft":
		{
			
			
			p.pushleft(v);
			p.display();
			p.size();
			break;
		}
		case "pushRight":
		{
			x1=sc.nextInt();
			p.pushright(x1);
			p.display();
			p.size();
			break;
		}
		case "popLeft":
		{
			
			p.popleft();
			p.display();
			p.size();
			break;
		}
		case "popRight":
		{
			p.popRight();
			p.display();
			p.size();
			break;
		}
		case "size":
		{
			p.size();
			break;
		}
		}
		
		
		//p.display();
		//p.size();
	if(x==0)
	{break;
	}
x--;
}
}
} 