package Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class LoopAdditionNumbered_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=1; i<=testCase; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			bw.write("Case #"+i+": ");
			bw.write(a+" + "+b+" = ");
			bw.write(Integer.parseInt(a) + Integer.parseInt(b)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
