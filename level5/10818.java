import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int min,max;
		
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		min = max = arr[0];
		for(int j=1;j<a;j++) {
			if(arr[j] >max)
				max = arr[j];
			if(arr[j]<min)
				min = arr[j];
		}
		
		System.out.printf("%d %d", min, max);
	}
}