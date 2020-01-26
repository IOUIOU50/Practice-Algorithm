import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");

		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());

		int i = 0;

		if (b >= c) {
			bw.write("-1"); bw.flush();
			bw.close(); br.close();
			return;
		} else {
			while (a + (b * i) >= c * i) {
				i++;
			}

			bw.write(Integer.toString(i));
			bw.flush();

			bw.close();
			br.close();
		}
	}

}
