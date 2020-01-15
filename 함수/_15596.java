package 백준_단계별풀어보기_정수N개의합;

public class _15596 {
	public static long sum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
