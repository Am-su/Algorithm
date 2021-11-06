import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int min = a>b ? b : a;
		
		if(min>c-a)
			min = c-a;
		if(min>d-b)
			min = d-b;
		System.out.println(min);
	}
}