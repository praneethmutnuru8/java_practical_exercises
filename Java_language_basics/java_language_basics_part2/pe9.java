import java.util.*;
public class pe9 {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  String s= sc.nextLine();
	  
	  char c[] = s.toCharArray();
	  int i = 0, j = c.length - 1;
	  while (i < j) 
	  {
			  char tmp = c[i];
			  c[i] = c[j];
			  c[j] = tmp;
			  i++;
			  j--;
	  }
	  for(j=0;j<c.length;j++)
	  {
        System.out.print(c[j]);
	  }
	  sc.close();
  }

}
