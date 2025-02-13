import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		num /= 4;

		sb.append("long ".repeat(Math.max(0, num)));

		sb.append("int");
		
		System.out.println(sb);

	}

}
