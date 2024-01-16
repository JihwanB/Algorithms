import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] currentTime = br.readLine().split(":");
        int currentHour = Integer.parseInt(currentTime[0]);
        int currentMinute = Integer.parseInt(currentTime[1]);
        int currentSecond = Integer.parseInt(currentTime[2]);
        int currentTotalSecond = currentHour * 3600 + currentMinute * 60 + currentSecond;

        String[] dropTime = br.readLine().split(":");
        int dropHour = Integer.parseInt(dropTime[0]);
        int dropMinute = Integer.parseInt(dropTime[1]);
        int dropSecond = Integer.parseInt(dropTime[2]);
        int dropTotalSecond = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int ansTotalSecond = dropTotalSecond - currentTotalSecond;
        if (ansTotalSecond <= 0) {
            ansTotalSecond += 24 * 3600;
        }
        int ansHour = ansTotalSecond / 3600;
        int ansMinute = (ansTotalSecond % 3600) / 60;
        int ansSecond = ansTotalSecond % 60;

        String ans = String.format("%02d:%02d:%02d", ansHour, ansMinute, ansSecond);

        bw.write(ans);

        br.close();
        bw.flush();
        bw.close();
    }
}