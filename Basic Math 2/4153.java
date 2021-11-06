import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int top, mid, bot;
		
		for(;;) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a==0 && b==0 && c==0)
				break;
			top = mid = bot = a;
			if(b>top) top = b;
			if(c>top) top = c;
			
			if(b<bot) bot = b;
			if(c<bot) bot = c;
			
			if(a>bot && a<top)
				mid = a;
			else if(b>bot && b<top)
				mid = b;
			else
				mid = c;
			
			if(bot*bot + mid*mid == top*top) {
				System.out.println("right");
			}
			else
				System.out.println("wrong");
		}
	}
}