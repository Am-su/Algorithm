import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] list = {100,100,200,200,300,300,400,400,500};
		int i,temp;
		
		for(i=0;i<9;i++) {
			temp = sc.nextInt();
			if(temp>list[i]) 
				break;
			else {
				sum+=temp;
			}
		}
		if(i!=9)
			System.out.println("hacker");
		else if(sum>=100)
			System.out.println("draw");
		else
			System.out.println("none");
	}
}