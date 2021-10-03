import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10000];
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<a;j++) {
			if(arr[j]<b) {
				System.out.printf("%d ",arr[j]);
			}
		}
		
		
	}
}