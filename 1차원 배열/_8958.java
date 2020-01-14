package 백준_단계별로풀어보기_배열;

import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int count;
		int sum = 0;
		String result;

		for (int j = 0; j < testCase; j++) {
			count = 0;
			sum = 0;
			result = scanner.next();

			for (int i = 0; i < result.length(); i++) {
				if (result.charAt(i) == 'O') {
					count++;
					sum += count;
				} else
					count = 0;
			}
			System.out.println(sum);
		}
		scanner.close();
	}

}
