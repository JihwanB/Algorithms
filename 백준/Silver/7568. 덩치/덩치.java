import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Person {
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

    }
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        rankPerson(list);

        System.out.println(sb);

    }

    public static void rankPerson(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                if(list.get(i).weight<list.get(j).weight && list.get(i).height<list.get(j).height)
                    rank++;
            }
            sb.append(rank).append(" ");
        }
    }

}
