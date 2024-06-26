import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            // Reading and parsing input
            String input = sc.nextLine();
            String[] parts = input.split(",");

            if (parts.length != 3) {
                throw new IllegalArgumentException("Input must be in the format 'name,price,quantity'");
            }

            String name = parts[0].trim();
            Double price = Double.parseDouble(parts[1].trim());
            int quantity = Integer.parseInt(parts[2].trim());

            // Creating ItemSeparator object
            ItemSeparator itemData = new ItemSeparator(name,price,quantity);

            // Printing details
            System.out.println("Item Name: " + itemData.getName());
            System.out.println("Item Price: " + itemData.getPrice());
            System.out.println("Item Quantity: " + itemData.getQuantity());

        } catch (NumberFormatException e) {
            System.out.println("Error: Price and quantity must be numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}