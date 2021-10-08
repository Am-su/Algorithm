import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] list = sc.next().toCharArray();
		sc.close();
		int sum1=0,sum2 = 0;
		for(int i=0;i<list.length/2;i++) {
			sum1 += (list[i] - '0');
		}
		for(int i=list.length/2;i<list.length;i++) {
			sum2 += (list[i] - '0');
		}
		if(sum1 == sum2)
			System.out.println("LUCKY");
		else
			System.out.println("READY");
	}
}