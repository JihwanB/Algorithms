import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] notes = new int[8];
        
        for (int i = 0; i < notes.length; i++) 
            notes[i] = sc.nextInt();

        String order = "";
        
        for (int i = 0; i < notes.length - 1; i++) {
            
            if (notes[i] == notes[i + 1] - 1) 
                order = "ascending";
            else if (notes[i] == notes[i + 1] + 1) 
                order = "descending";
            else {
                order = "mixed";
                break;
            }
            
        }
        System.out.println(order);
    }
}
