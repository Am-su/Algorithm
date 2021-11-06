import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0)
				break;
			System.out.println(a+b);
		} while(a!=0 && b!=0);
	}
}
