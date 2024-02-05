import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int o1sum = 0;
                    int o2sum = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if ('0' <= o1.charAt(i) && o1.charAt(i) <= '9') {
                            o1sum += o1.charAt(i) - '0';
                        }
                        if ('0' <= o2.charAt(i) && o2.charAt(i) <= '9') {
                            o2sum += o2.charAt(i) - '0';
                        }
                    }
                    if (o1sum == o2sum) {
                        return o1.compareTo(o2);
                    }
                    return o1sum - o2sum;
                }
                return o1.length() - o2.length();
            }
        });

        for (String string : str) {
            bw.write(string + "\n");
            bw.flush();
        }
        bw.close();
    }

}
