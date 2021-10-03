import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean[] primelist;
		
		for(;;) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int count = 0;
			primelist = new boolean[2*n+1];
			primelist[0] = primelist[1] = true;
			
			for(int i=2;i<=Math.sqrt(primelist.length);i++) {
				if(primelist[i]) continue;
				for(int j=i*i;j<primelist.length;j=j+i)
					primelist[j] = true;
			}
			for(int i=n+1;i<=2*n;i++) {
				if(!primelist[i])
					count++;
			}
			System.out.println(count);
		}
	}
}