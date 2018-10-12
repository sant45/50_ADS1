

public class Percolation {
   private static final boolean True = false;
private static final boolean False = false;
int n;
	int r,c;
	int [][]a=new int [10][10];
	int n1;
	public Percolation(int n)
	{
     	this.n=n;
    for(int i=0;i<n;i++)
     	{
		 for(int j=0;j<n;j++)
		{
			a[i][j]=0;
		}
	}
    for(int i1=0;i1<n;i1++)
 	{
	 for(int j1=0;j1<n;j1++)
	{
		System.out.print(a[i1][j1]+"\t");
	}
	 System.out.println("\n");
}
   }
public void open(int row,int column)
{
	r=row;
	c=column;
    
	a[r][c]=1;
}
public void print()
{
	for(int i1=0;i1<n;i1++)
 	{
	 for(int j1=0;j1<n;j1++)
	{
		 if(a[r][c]==a[i1][j1])
		 {
			 a[i1][j1]=1;
			 //System.out.print(a[i1][j1]+"\t");
		 }
			 
		System.out.print(a[i1][j1]+"\t");
	}
	 System.out.println("\n");
}
}
public boolean per()
{
 int c=1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(a[i][j]==1)
			{
				if(i>0&&a[i-1][j]==1)
				 {
				c++;
				//System.out.println(c);
				
				}
				if(a[i][j+1]==1)
				{
					if(i>0&&j>0&&a[i-1][j]==1&&a[i-1][j-1]==1||a[i-1][j+1]==1)
							{
						      c++;
						      break;
							}
				}
				if(i>0&&i>n&&j>0&&j<n&&a[i-1][j]==1||a[i-1][j-1]==1||a[i-1][j+1]==1)
				{
					c++;
					System.out.println(c);
					break;
					
				}
			}
		}
	}
if(c==n)
{
	System.out.println("true");
	System.out.println(c);
	return True;
}
else
	System.out.println("False");
System.out.println(c);	
return False;
}
public int numberofopensites(int n1)
{
	return n1;
}

}

