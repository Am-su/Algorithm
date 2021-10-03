import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		int[] arr2 = new int[42];
		int n=0;
		
		for(int e:arr2) {
			e = 0;
		}
		for(int i=0;i<10;i++) {
			arr1[i] = sc.nextInt();
			arr2[arr1[i]%42]++;
		}
		for(int i=0;i<42;i++) {
			if(arr2[i] != 0)
				n++;
		}
		System.out.println(n);
	}
}