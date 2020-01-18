import java.util.Scanner;

public class _2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int num;
		String str;
		for(int i=0; i<testCase; i++) {
			num = sc.nextInt();
			str = sc.next();
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<num; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
