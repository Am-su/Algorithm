import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Han(n));
	}
	public static int Han(int n) {
		int count = 99;

		if(n>=1 && n<100) {
			return n;
		}
		else if(n>=100 && n<1000) {
			for(int j=100;j<=n;j++) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				int temp = j;
				while(temp!=0) {
					list.add(temp%10);
					temp /= 10;
				}
				if((list.get(0) - list.get(1)) == (list.get(1) - list.get(2)))
					count++;
			}
		return count;
		}
		else if(n==1000)
			return Han(999);
		else
			return -1;
	}
}