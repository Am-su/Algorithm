import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int i=0;
		String str = sc.nextLine();
		
		for(i=0;i<str.length();i++) {
			count++;
			
			if(str.charAt(i)=='c' && i<str.length()-1) {
				if(str.charAt(i+1)=='=')
					i++;
				else if(str.charAt(i+1)=='-') 
					i++;
			}
			
			else if(str.charAt(i)=='d' && i<str.length()-1) {
				if(str.charAt(i+1)=='-')
					i++;
				else if(i<str.length()-2 && str.charAt(i+1)=='z' && str.charAt(i+2)=='=') 
						i+=2;
			}
			
			else if(str.charAt(i)=='l' && i<str.length()-1) {
				if(str.charAt(i+1)=='j')
					i++;
			}
			
			else if(str.charAt(i)=='n' && i<str.length()-1){
				if(str.charAt(i+1)=='j')
					i++;
			}
			else if(str.charAt(i)=='s' && i<str.length()-1) {
				if(str.charAt(i+1)=='=')
					i++;
			}
			else if(str.charAt(i)=='z' && i<str.length()-1) {
				if(str.charAt(i+1)=='=')
					i++;
			}
		}
		System.out.println(count);
	}
}