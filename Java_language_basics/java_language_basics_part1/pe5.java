import java.io.IOException;
import java.util.Scanner;

public class Pe5 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		String str[] = sc.nextLine().split(" ");
		int res = 0;
		try {
			for(int i=0;i<str.length;i++) { 
				res += Integer.parseInt(str[i]);
			}
			System.out.println(res);
		}catch(Exception e) {
			System.out.println("Entered value are not integers"); 
		}
		sc.close();
		
	}

}
