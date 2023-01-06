import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class VendingMachine {
    private static final int BANANA_CHIPS_PRICE = 70;
    private static final int CANDY_PRICE = 30;
    private static final int WATER_PRICE = 25;

    public  void buyProduct() {


        HashMap<String, Integer> products = new HashMap<>();
        products.put("Banana Chips", 70);
        products.put("Candy", 30);
        products.put("Water", 25);

        int coins = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==================================" +
                    "\nAvailable products in the machine:");
            for (String product : products.keySet()) {
                System.out.println("[" + products.get(product) + "] - " + product);
            }
            System.out.println("Amount: " + coins);

            System.out.println("What do you want to do:");
            System.out.println("a - throw more coins");
            System.out.println("q - exit");
            for (String product : products.keySet()) {
                if (coins >= products.get(product)) {
                    System.out.println(product.charAt(0) + " - buy " + product);

                }
            }

            String input = scanner.nextLine().toLowerCase();
            if (input.equals("a")) {
                System.out.println("Enter the number of coins you want to throw:");
                coins += scanner.nextInt();
                scanner.nextLine();
            } else if (input.equals("q")) {
                break;
            }
                for (String product : products.keySet()) {
                    if(input.equals("b")){
                        System.out.println("You bought a Banana Chips" );
                        coins -=BANANA_CHIPS_PRICE;
                        break;
                    }
                    if(input.equals("c")){
                        System.out.println("You bought a Candy" );
                        coins -=CANDY_PRICE;
                        break;
                    }
                    if(input.equals("w")){
                        System.out.println("You bought a Water" );
                        coins -=WATER_PRICE;
                        break;

                    }
                }
        }
    }
}
