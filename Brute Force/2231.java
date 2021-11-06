import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int creator=0;
		int j;
		int i=0;
		for(i=1;i<n;i++) {
			creator = j = i;
			while(j !=0) {
				creator += (j %10);
				j /=10;
			}
			if(creator == n)
				break;
		}
		if(creator == n)
			System.out.println(i);
		else
			System.out.println(0);
	}
}