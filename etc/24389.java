import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] basic = getBi(N);
		int[] compare = complementTwo(basic);
		int count=0;
		for(int i=0;i<32;i++) {
			if(basic[i] != compare[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
	static int[] getBi(int n) {
		int[] result = new int[32];
		
		for(int i=31;i>0;i--) {
			if(n<=0)
				break;
			result[i] = n%2;
			n/=2;
		}
		return result;
	}
	
	static int[] complementTwo(int[] arr) {
		int[] result = arr.clone();
		for(int i=0;i<32;i++) {
			if(result[i]==0) 
				result[i]=1;
			else
				result[i]=0;
		}
		result[31]++;
		for(int i=31;i>0;i--) {
			if(result[i]==2) {
				result[i-1]++;
				result[i]=0;
			}
		}
		return result;
	}
}