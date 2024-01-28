import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static class User {
        int age;
        String name;
        int entrance;

        User(int age, String name, int entrance) {
            this.age = age;
            this.name = name;
            this.entrance = entrance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        User[] users = new User[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            users[i] = new User(Integer.parseInt(st.nextToken()), st.nextToken(), i);
        }

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.age == o2.age)
                    return o1.entrance - o2.entrance;
                return o1.age - o2.age;
            }
        });

        for (User u : users) {
            bw.write(u.age + " " + u.name + "\n");
        }
        bw.flush();
    }
}
