package yasmin;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter pokemon 1 ");
        String pokemon1 = scan.nextLine();
        System.out.println(pokemon1);

        System.out.println("enter pokemon 2 ");
        String pokemon2 = scan.nextLine();

        System.out.println("enter pokemon 3 ");
        String pokemon3 = scan.nextLine();

        System.out.println("enter pokemon 4 ");
        String pokemon4 = scan.nextLine();

        System.out.println("here are the pokemon");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);







    }
}
