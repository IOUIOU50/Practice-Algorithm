import java.util.Scanner;

public class _11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		String num = sc.next();
		
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum += Integer.parseInt(Character.toString(num.charAt(i)));
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
