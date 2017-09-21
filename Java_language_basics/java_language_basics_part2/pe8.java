import java.util.*;
public class pe8 {

	public static void main(String args[])
	{
		int target = 73;
		System.out.println("Choose a number between 1-100");
		Scanner sc = new Scanner(System.in);
		int a=0;
		while(true)
		{
		  	a=sc.nextInt();
		  	if(a>target)
		  	{
		  		System.out.println("Number guessed is more than original number");
		  	}
		  	else if (a<target)
		  	{
		  		System.out.println("Number guessed is less than original number");
		  	}
		  	else
		  		break;
		}
		System.out.println("Congratulations! you have found the original number "+a);
		sc.close();
	}
}
