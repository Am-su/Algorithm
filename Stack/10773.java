import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int size=0;
		int sum =0;
		
		for(int i=0;i<n;i++) {
			int input = sc.nextInt();
			if(input == 0) {
				list.remove(size-1);
				size--;
			}
			else {
				list.add(input);
				size++;
			}
		}
		sc.close();
		for(int li : list) {
			sum+=li;
		}
		System.out.println(sum);
	}
}