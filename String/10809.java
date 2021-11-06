import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] list = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		String word = sc.next();
		for(int i=0;i<list.length;i++)
			System.out.println(word.indexOf(list[i]));
	}
}