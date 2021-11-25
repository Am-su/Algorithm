import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int list[] = new int[8];
		for(int i=0;i<list.length;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		int i=0;
		if(list[0] == 1) {
			for(i=0;i<7;i++) {
				if(list[i]+1 != list[i+1])
					break;
			}
			if(i==7)
				System.out.println("ascending");
			else
				System.out.println("mixed");
		}
		else if(list[0] == 8) {
			for(i=0;i<7;i++) {
				if(list[i]-1 != list[i+1])
					break;
			}
			if(i==7)
				System.out.println("descending");
			else
				System.out.println("mixed");
		}
		else
			System.out.println("mixed");
	}
}