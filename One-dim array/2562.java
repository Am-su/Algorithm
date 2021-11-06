import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max;
		int idx=0;
		
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		max = arr[0];
		for(int j=0;j<9;j++) {
			if(arr[j] >=max) {
				max = arr[j];
				idx = j+1;
			}
		}
		
		System.out.println(max);
		System.out.print(idx);
	}
}