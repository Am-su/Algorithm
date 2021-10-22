import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] arr1,arr2;
		String str1,str2;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			str1 = st.nextToken();
			str2 = st.nextToken();
			arr1 = str1.toCharArray();
			arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
				sb.append(str1).append(" & ").append(str2).append(" are anagrams.\n");
			else
				sb.append(str1).append(" & ").append(str2).append(" are NOT anagrams.\n");
		}
		System.out.println(sb);
	}
}