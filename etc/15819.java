import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int search = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(br.readLine());
		}
		br.close();
		Collections.sort(list);
		System.out.println(list.get(search-1));
	}
}