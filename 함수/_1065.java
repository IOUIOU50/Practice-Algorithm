import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(i<100)
				count++;
			else {
				int d1 = i%100/10 - i/100;
				int d2 = i%10 -i%100/10;
				
				if(d1 == d2)
					count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		br.close();
		bw.close();
	}
}
