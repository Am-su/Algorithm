import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      for(int i=0;i<n;i++) {
         int even = sc.nextInt();
         int a = even/2;
         int b = even/2;
         while(true) {
        	 if(isPrime(a) && isPrime(b)) {
        		 System.out.println(a+" "+b);
        		 break;
        	 }
        	 else {
        		 a--;
        		 b++;
        	 }
         }
      }
   }
   public static boolean isPrime(int n) {
      int i;
      for(i=2;i<n;i++) {
         if(n % i == 0) {
            break;
         }
      }
      if(n==i)
         return true;
      else
         return false;
   }
}