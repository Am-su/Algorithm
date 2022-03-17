import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dwarf = new int[9];
		int sum = 0;
		int a = 0; int b = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<dwarf.length;i++) {
			dwarf[i] = Integer.parseInt(br.readLine());
			sum +=dwarf[i];
		}
		Arrays.sort(dwarf);
		
		for(int i=0;i<dwarf.length-1;i++) {
			for(int j=i+1;j<dwarf.length;j++) {
				if((sum - dwarf[i] - dwarf[j]) == 100) {
					a = i;
					b = j;
				}
			}
		}
		for(int k=0;k<dwarf.length;k++) {
			if((k!=a) && (k!=b)) {
				sb.append(dwarf[k]).append("\n");
			}
		}
		System.out.print(sb);
	}
}