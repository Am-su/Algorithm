import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] fibonacci = new int[21];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int i=2;i<21;i++) {
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2]; 
		}
		System.out.println(fibonacci[n]);
	}
}