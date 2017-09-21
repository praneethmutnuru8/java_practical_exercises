import java.util.*;
import java.io.*;
public class pe10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    int a =sc.nextInt();
    int i;
    
    for(i=0;i<a;i++)
    {
    	s=s.concat(s);
    }
    
    System.out.println(s);
    
    sc.close();

	}

}
