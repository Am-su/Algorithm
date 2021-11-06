import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int a = sc.nextInt();
		while(a!=0) {
			list.add(a%10);
			a /=10;
		}
		Collections.sort(list,Comparator.reverseOrder());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
}