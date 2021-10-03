import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>0) {
			if(b-45 <0) {
				a-=1;
				b=b+60-45;
			}
			else if(b-45 == 0) {
				b=0;
			}
			else
				b-=45;
		}
		else if(a ==0) {
			if(b-45 <0) {
				a = 23;
				b=b+60-45;
			}
			else if(b-45 == 0) {
				b=0;
			}
			else
				b-=45;
		}
		System.out.printf("%d %d", a,b);
	}
}
