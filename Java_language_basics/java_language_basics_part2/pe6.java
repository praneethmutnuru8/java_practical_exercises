import java.util.Scanner;

public class pe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int t = (int) c;
		if (t >= 97 && t <= 122)
			System.out.println(" a small case letter");
		else if (t >= 65 && t <= 90)
			System.out.println(" Capital letter");
		else if (t >= 48 && t <= 57)
			System.out.println(" digit");
		else
			System.out.println(" a sspecial symbol");
		sc.close();
	}

}
