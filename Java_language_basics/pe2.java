import java.util.*;

public class Pe2 {
	
	private static Scanner s;

	public static void main(String args[])
	{
		s = new Scanner(System.in);
		int num;
		num=s.nextInt();
		
		if(num>=20 && num<=30)
		{
			if((num%2)==0)
		    	System.out.println("Jerry ");
			else
				System.out.println("Tom ");
				
		}
		
	}
 }


