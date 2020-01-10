package ConditionalStatement;

import java.util.Scanner;

public class Secondary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(((a-b>=0)&&(a-c<=0)) || (a-b<=0)&&(a-c>=0))
			System.out.println(a);
		else if((b-a>=0&&b-c<=0) || (b-a<=0&&b-c>=0))
			System.out.println(b);
		else
			System.out.println(c);
	}

}
