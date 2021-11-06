import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
   public static int[] list;
   public static int count = 0;
   public static int n;
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      n = Integer.parseInt(br.readLine());
      list = new int[n];
      queen(0);
      System.out.println(count);
      
   }
   
   public static void queen(int depth) {
      
      if(depth == n) {
         count++;
         return;
      }
      
      for(int i=0;i<n;i++) {
         list[depth] = i;
         if(checkboolean(depth))
        	 queen(depth+1);
      }
   }
   public static boolean checkboolean(int le) {
       
	   for(int i=0;i<le;i++) {
		   if(list[le] == list[i])
			   return false;
		   else if(Math.abs(le - i) == Math.abs(list[le] - list[i]))
			   return false;
	   }
      
      return true;
   }
}