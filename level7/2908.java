import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list1 = new int[3];
		int[] list2 = new int[3];
		int n1,n2;
		int result;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for(int i=0;i<3;i++) {
			list1[i] = n1 % 10;
			n1 /=10;
			list2[i] = n2 % 10;
			n2 /=10;
		}
		n1 = list1[2]+10*list1[1]+100*list1[0];
		n2 = list2[2]+10*list2[1]+100*list2[0];
		result = n1>n2 ? n1:n2;
		System.out.println(result);
		
	}
}