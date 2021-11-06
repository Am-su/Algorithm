import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] list = new String[n];
		sc.nextLine();
		for(int i=0; i<n;i++) {
			list[i] = sc.nextLine();
		}
		Arrays.sort(list, (s1,s2)->{
			if(s1.toString().length() == s2.toString().length()) {
				return s1.compareTo(s2);
			}
			else
				return s1.toString().length() - s2.toString().length();
		});

		System.out.println(list[0]);
		
		for(int i=1;i<n;i++) {
			if(!list[i].equals(list[i-1])) {
				System.out.println(list[i]);
			}
		}
	}
}