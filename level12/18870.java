import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Map<Integer,Integer> map = new HashMap<>();
		int n = sc.nextInt();
		int count = 0;
		int[] list = new int[n];
		
		for(int i=0;i<n;i++) {
			list[i] = sc.nextInt();
		}
		
		int[] listclone = list.clone();
		
		Arrays.sort(listclone);
		for(int i=0;i<listclone.length;i++) {
			if(!map.containsKey(listclone[i])) {
				map.put(listclone[i], count++);
			}
		}
		for(int i=0;i<list.length;i++) {
			sb.append(map.get(list[i])+" ");
		}
		System.out.println(sb);
	}
}