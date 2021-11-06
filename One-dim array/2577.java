import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		int a,b,c,m;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		m = a*b*c;
		
		while(m !=0) {
			arr1[m%10]++;
			m /= 10;
		}
		for(int e:arr1) {
			System.out.println(e);
		}
	}
}