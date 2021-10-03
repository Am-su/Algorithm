import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();		
		
		for(int i=0;i<n1;i++) {
			int n2 = sc.nextInt();
			int[] list = new int[n2];
			int sum = 0;
			double count=0;
			
			for(int k=0;k<n2;k++) {
				list[k] = sc.nextInt();
				sum += list[k];
			}
			double avg = sum / n2;
			for(int k=0;k<n2;k++) {
				if(list[k] > avg)
					count++;
			}
			double rate = (count / n2)*100;
			System.out.println(String.format("%.3f",rate)+ "%");
		}
	}
}
