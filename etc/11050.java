import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int top = 1;	//분자
		int bottom = 1; //분모
		
		if(b==0 || b==a) {
			System.out.println("1");
		}
		else {
			for(int i=a;i>a-b;i--) {
				top *=i;
			}
			for(int i=1;i<=b;i++) {
				bottom *=i;
			}
			System.out.println(top/bottom);
		}
	}
}