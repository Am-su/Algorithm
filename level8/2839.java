import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList();
		
		for(int i=0;i<=a/3;i++)
			if((a-3*i)%5 == 0) 
				list.add(i+(a-3*i)/5);
		
		if(list.isEmpty()) {
			System.out.println(-1);
		}
		else {
			System.out.println(Collections.min(list));
		}
	}
}