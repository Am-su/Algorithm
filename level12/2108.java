import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      
	  Scanner sc = new Scanner(System.in);
      int[] list = new int[8001];
      int n = sc.nextInt();
      int sum = 0;
      int temp=0;
      int min = 4001;
      int max = -4001;
      int mid = 4001;
      int best = 4001;
      
      for(int i=0;i<n;i++) {
    	  temp = sc.nextInt();
    	  list[temp+4000]++;
    	  sum+=temp;
    	  if(temp>max)
    		  max = temp;
    	  if(temp<min)
    		  min = temp;
      }
      int count = 0;
      int maxbest = 0;
      boolean flag = false;
      
      for(int i=min+4000;i<=max+4000;i++) {
    	  if(list[i]>0) {
    		  if(count<(n+1)/2) {
    			  count+=list[i];
    			  mid = i-4000;
    		  }
    		  if(maxbest < list[i]) {
    			  maxbest = list[i];
    			  best = i-4000;
    			  flag = true;
    		  }
    		  else if(maxbest == list[i] && flag == true) {
    			  best = i-4000;
    			  flag = false;
    		  }
    	  }
      }

      System.out.println((int)Math.round((double)sum / n));
      System.out.println(mid);
      System.out.println(best);
      System.out.println(max-min);
   }
}