import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] arr1 = new double[a];
		double avg=0;
		double max = 0;
		for(int i=0;i<a;i++) {
			arr1[i] = sc.nextInt();
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}

		for(int i=0;i<a;i++) {
			arr1[i] = (arr1[i]/max)*100;
			avg +=arr1[i];
		}
		avg /=a;
		System.out.println(avg);
	}
}