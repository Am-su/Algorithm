import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int copy=a;
		int n=0;
		int front,back,rest;
		do{
			if(copy / 10 == 0) {
				front = 0;
				back = copy;
				copy = 10*back+back;
				n++;
			}
			else {
				front=copy/10;
				back = copy%10;
				if((back+front)>=10) {
					rest =(back+front)%10;
				}
				else {
					rest=back+front;
				}
				copy = back*10 + rest;
				n++;
			}
		}while(a != copy);
		System.out.println(n);
	}
}