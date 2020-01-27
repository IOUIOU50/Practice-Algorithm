import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;

		if (n % 5 == 0) {
			min = n / 5;
		}

		else {
			for (int i = 0; 5 * i < n; i++) {
				int rest = (n-(5*i))%3;
				int minTemp = i + (n-(5*i))/3;
				if (rest == 0 && min>minTemp) {
					min = minTemp;
				}
			}
		}

		if(min==Integer.MAX_VALUE) {
			if(n%3==0)
				min=n/3;
			else
				min=-1;
		}
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
		br.close();
	}
}
