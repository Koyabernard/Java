import java.util.Scanner;

public class Performance{
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);

        String[] items = {"Caramel Machiatto", "Americano", "Frapped", "Hazelnut", "Salted Caramel", "Mango Shake"};
        double[] prices = {99, 89, 89, 100, 99, 60};
        int[] quantity = new int [items.length];

        boolean ordering = true;

        System.out.println("==== Welcome sa Coffee Shop Boi =====");

        while (ordering){
            System.out.println("/n====== Menu ======");
            for (int i = 0; i < items.length; i++){
                System.out.println("[" + (i + 1) + "]" + items[i] +  "- " + prices [i]);
            }
            System.out.println("[0] Finish order");
            System.out.println("Choose an item number: ");

            int choice = input.nextInt();

            if (choice == 0){
                ordering = false;
                break;
            }

            if (choice < 1){
                System.out.println("Invalid Option");
                continue;
            }
            System.out.println("Enter quantity for" + items[choice - 1] + ": ");
            int qty = input.nextInt();

            if (qty <= 0){
                System.out.println("Invalid quantity");
                continue;
            }

            quantity [choice - 1] += qty;
            System.out.println("Added" + qty + "x " + items[choice - 1] + "to your order");
        }
        System.out.println("/n====Order Receipt =====");
        double total = 0;

        for (int i = 0; i < items.length; i++){
            if (quantity[i] > 0){
                double subtotal = quantity [i] * prices[i];
                System.out.println(items[i] + " x" + quantity[i] + " - " + subtotal);
                total += subtotal;
            }
        }

        System.out.println("----------------");
        System.out.println("TOTAL BILL: " + total);
        System.out.println("Salamat sa pag order Boi");
    }
}