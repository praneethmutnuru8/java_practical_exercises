import java.util.*;

public class Pe4{

	
	private static Scanner sc;

	public static void main(String args[])
	{
		int i,j,num; 
		sc = new Scanner(System.in);
		num= sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(i);
			}
		}
	}
}

