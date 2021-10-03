import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList();
		for(int i=1;i<10000;i++) {
			if(d(i)<10000)
				list.add(d(i));
		}
		for(int i=1;i<10000;i++) {
			if(list.contains(i) == false) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int n) {
		int dr = n;
		while(n!=0) {
			dr+=(n%10);
			n/=10;
		}
		return dr;
	}
}