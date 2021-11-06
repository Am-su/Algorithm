import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);


		for(int i=0;i<n;i++) {
			sb.append(list.get(i)).append('\n');
		}
		System.out.println(sb);
	}
}