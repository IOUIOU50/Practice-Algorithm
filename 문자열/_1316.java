import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1316 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		int count = testCase;

		for (int i = 0; i < testCase; i++) {
			String str = br.readLine();
			boolean flag = true;

			if (str.length() != 1) {
				for (int j = 0; j < str.length(); j++) {
					char c = str.charAt(j);

					while (j < str.length() - 1 && c == str.charAt(j + 1)) {
						j++;
					}

					for (int k = j+1; k < str.length(); k++) {
						if (c == str.charAt(k)) {
							flag = false;
						}
					}
				}
			}
			if(!flag)
				count--;
		}

		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
