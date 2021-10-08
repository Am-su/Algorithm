import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] list;
		int diff,sum;
		for(int i=0;i<n;i++) {
			list = new int[5];
			for(int j=0;j<5;j++) {
				list[j] = sc.nextInt();
			}
			Arrays.sort(list);
			diff = list[3] - list[1];
			if(diff >= 4)
				sb.append("KIN"+"\n");
			else {
				sum = list[1]+list[2]+list[3];
				sb.append(sum+"\n");
			}
		}
		sc.close();
		System.out.println(sb);
	}
}