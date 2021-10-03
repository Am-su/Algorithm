import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int num = sc.nextInt();
		int i,j;
		for(i=0;i<num;i++) {
			String str = sc.next();
			int[] arr = new int[26];
			int re = 0;
			arr[((int)str.charAt(0))-((int)'a')]++;
			
			for(j=1;j<str.length();j++) {
				if(str.charAt(j) != str.charAt(j-1) && arr[(int)str.charAt(j)-((int)'a')] != 0)
					re = 1;
				
				arr[((int)str.charAt(j))-((int)'a')]++;
			}
			if(re != 0)
				continue;
			count++;
		}
		
		System.out.println(count);
	}
}