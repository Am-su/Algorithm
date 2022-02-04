import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[][] list;
	static int N;
	static StringBuilder sb;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		list = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<N;j++) {
				list[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] result = matrix(list,B);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int[][] matrix(int[][] list, long b) {
		if(b==1) {
			return list;
		}
		int[][] temp = matrix(list,b/2);

		temp = mul(temp,temp);
		if(b%2==1) {
			temp = mul(temp,list);
		}
		return temp;
	}
	static int[][] mul(int[][] mat1, int[][] mat2){
		int[][] result = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					result[i][j] = (result[i][j]%1000 + (mat1[i][k] * mat2[k][j])%1000) % 1000;
				}
			}
		}
		return result;
	}
}