import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이렇게 푸는게 맞나,,?
public class Main{
	static int row;
	static int col;
	static int max=0;
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		arr = new int[row][col];
		
		for(int i=0;i<row;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<col;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		shapeOne();
		shapeTwo();
		shapeThree();
		shapeFour();
		shapeFive();
		System.out.println(max);
	}
	static void shapeOne() {
		int sum;
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row-3;j++) {
				sum = arr[j][i]+arr[j+1][i]+arr[j+2][i]+arr[j+3][i];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col-3;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
				if(sum>max)
					max = sum;
			}
		}
	}
	static void shapeTwo() {
		int sum;
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1];
				if(sum>max)
					max = sum;
			}
		}
	}
	static void shapeThree() {
		int sum;
		for(int i=0;i<row-2;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=1;i<row;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i-1][j+1]+arr[i-1][j+2];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=2;i<row;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i-1][j]+arr[i-1][j+1]+arr[i-2][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
				if(sum>max)
					max = sum;
			}
		}
	}
	static void shapeFour() {
		int sum;
		for(int i=0;i<row-1;i++) {
			for(int j=1;j<col-1;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-2;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=1;i<row-1;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i-1][j+1]+arr[i+1][j+1];
				if(sum>max)
					max = sum;
			}
		}
	}
	static void shapeFive() {
		int sum;
		for(int i=0;i<row-2;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=2;i<row;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i-1][j+1]+arr[i-2][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=1;i<row;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i-1][j+2];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-2;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-2;i++) {
			for(int j=0;j<col-1;j++) {
				sum = arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i][j+2];
				if(sum>max)
					max = sum;
			}
		}
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-2;j++) {
				sum = arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2];
				if(sum>max)
					max = sum;
			}
		}
	}
}