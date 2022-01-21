import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		LinkedList<int[]> queue;
		StringBuilder sb = new StringBuilder();
		
		//문서 개수, 궁금한 문서
		int a,b;			
		
		for(int i=0;i<n;i++) {
			queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<a;j++) {
				queue.add(new int[] {j,Integer.parseInt(st.nextToken())});
			}
			int count=0;
			while(!queue.isEmpty()) {
				int[] temp = queue.poll();
				boolean bool = true;
				
				for(int j=0;j<queue.size();j++) {
					if(temp[1] < queue.get(j)[1]) {
						queue.offer(temp);
						for(int k=0;k<j;k++) {
							queue.offer(queue.poll());
						}
						bool=false;
						break;
					}
				}
				
				if(bool==false) {
					continue;
				}
				count++;
				if(temp[0]==b)
					sb.append(count).append("\n");
			}
			
		}
		System.out.println(sb);
	}
}