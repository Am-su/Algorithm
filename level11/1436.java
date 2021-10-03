import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] list = new int[10000];
		int count = 0;
		for(int i=0;count<10000;i++) {
			int six = 0;
			int temp = i;
			int past;
			while(temp!=0) {
				
				if(six>=3) 
					break;
				if(temp % 10 == 6) 
					past = 1;
				else {
					past = 0;
					six = 0;
				}
				if(temp % 10 == 6 && past == 1) 
					six++;	
				temp /=10;
			}
			if(six>=3) 
				list[count++] = i;
		}
		System.out.println(list[n-1]);
	}
}