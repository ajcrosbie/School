import java.util.Scanner;

public class timesTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what times table");
        int table = input.nextInt();
        System.out.println("what end point");
        int end = input.nextInt();
        for (int i = 0; i < end + 1; i++) {
            Integer v = i * table;
            System.out.println(v);
            ;
        }
    }
}
