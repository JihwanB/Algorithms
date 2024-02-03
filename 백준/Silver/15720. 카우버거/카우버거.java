import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int burgerNum, sideNum, drinkNum, setCount, totalPrice = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<Integer> burger = new ArrayList<>(), side = new ArrayList<>(), drink = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        int discountedPrice = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        burgerNum = Integer.parseInt(st.nextToken());
        sideNum = Integer.parseInt(st.nextToken());
        drinkNum = Integer.parseInt(st.nextToken());

        setMenuList(burger, burgerNum);
        setMenuList(side, sideNum);
        setMenuList(drink, drinkNum);

        discountedPrice += getDiscountedPrice();
        discountedPrice += getRemainingPrice(burger, side, drink);

        bw.write(totalPrice + "\n" + discountedPrice);
        bw.flush();

    }

    static void setMenuList(List<Integer> foodType, int foodNum) throws IOException {

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < foodNum; i++) {
            foodType.add(i, Integer.parseInt(tokenizer.nextToken()));
            totalPrice += foodType.get(i);
        }

        foodType.sort((o1, o2) -> o2 - o1);

    }

    public static int getDiscountedPrice() {

        int price = 0;
        for (int i = 0; i < 1000; i++) {
            if (i >= burgerNum || i >= sideNum || i >= drinkNum) break;
            price += (int) ((burger.get(i) + side.get(i) + drink.get(i)) * 0.9);
            setCount++;
        }

        return price;

    }

    public static int getRemainingPrice(List<Integer> burger, List<Integer> side, List<Integer> drink) {

        int price = 0;
        price += getSinglePrice(burger);
        price += getSinglePrice(side);
        price += getSinglePrice(drink);

        return price;

    }

    public static int getSinglePrice(List<Integer> foodType) {

        int price = 0;
        for (int i = setCount; i < foodType.size(); i++) {
            price += foodType.get(i);
        }

        return price;

    }

}
