package 백준_단계별로풀어보기_배열;

import java.util.Scanner;

public class _1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		double[] grade = new double[n];
		double max = 0;
		double sum=0;
		
		for(int i=0; i<n; i++) {
			grade[i] = scanner.nextDouble();
			if(max<grade[i]) {
				max = grade[i];
			}
		}
		
		for(int j=0; j<n; j++) {
			grade[j] = grade[j]/max*100;
			sum += grade[j];
		}
		
		scanner.close();
		System.out.println(sum/n);
	}

}
