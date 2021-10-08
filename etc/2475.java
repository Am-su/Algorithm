import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			list[i] = sc.nextInt();
			sum+=Math.pow(list[i], 2);
		}
		System.out.println(sum %=10);
		
	}
}