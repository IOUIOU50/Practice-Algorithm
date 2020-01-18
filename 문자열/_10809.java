import java.util.Arrays;
import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		String str = sc.nextLine();
		sc.close();
		
		for(int i=0; i<str.length(); i++) {
			if(alphabet[str.charAt(i)-97]==-1) {
				alphabet[str.charAt(i)-97] = i;
			}
		}
		for(int i=0; i<alphabet.length; i++)
			System.out.print(alphabet[i]+" ");
	}

}
