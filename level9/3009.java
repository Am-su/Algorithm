import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int[] list = new int[6];
      list[0] = sc.nextInt();
      list[1] = sc.nextInt();
      list[2] = sc.nextInt();
      list[3] = sc.nextInt();
      list[4] = sc.nextInt();
      list[5] = sc.nextInt();
      
      if(list[0] == list[2])
    	  System.out.print(list[4]+" ");
      else if(list[0] == list[4])
    	  System.out.print(list[2]+" ");
      else
    	  System.out.print(list[0]+" ");
      if(list[1] == list[3])
    	  System.out.print(list[5]);
      else if(list[1] == list[5])
    	  System.out.print(list[3]);
      else
    	  System.out.print(list[1]);
   }
}