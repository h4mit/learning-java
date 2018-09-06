import java.util.Scanner;

public class PrintStars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 0; i < x; i++) {
            for (int Y = 0; Y < x ; Y++)
                System.out.print('*');
            System.out.println();
        }
    }
}