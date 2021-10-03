import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int max1,max2;
		int idx = 0;
		int[] list = new int[26];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >=65 && str.charAt(i) <=90) {
				list[(int)str.charAt(i)-65]++;
			}
			else if(str.charAt(i) >=97 && str.charAt(i) <=122) {
				list[(int)str.charAt(i)-97]++;
			}
		}
		max1 = max2 = 0;
		for(int i=0;i<list.length;i++) {
			if(list[i]>max1) {
				max1 = list[i];
				idx = i;
			}
		}
		list[idx] = 0;
		for(int i=0;i<list.length;i++) {
			if(list[i]>max2) {
				max2 = list[i];
			}
		}
		if(max1 == max2)
			System.out.println("?");
		else
			System.out.println((char)(idx+65));
	}
}