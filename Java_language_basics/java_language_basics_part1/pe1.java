import java.util.*;


public class pe1 {

	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		int num,t,i,r=0,sum=0,evsum=0;
		String s = sc.next();
		num = Integer.parseInt(s);
		t=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(sum==t) {
			while(sum!=0)
			{
				i=sum%10;
				if(i%2==0) {
					evsum+=i;
				}
				sum=sum/10;
				
			}
			if(evsum>25)
			System.out.println(t+" is a plaindrome and sum of even terms is greater than 25");
			else
			System.out.println(t+" is a plaindrome and sum of even terms is not greater than 25");
		}
		else {
			System.out.println(t+" is not a plaindrome");
		}
	}
}

