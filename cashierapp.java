import java.util.Scanner;

public class cashierapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user to input item's name
        System.out.print("Enter item's name: ");
        String itemName = input.nextLine();
        
        // Ask user to input item's price
        System.out.print("Enter item's price: ");
        double itemPrice = input.nextDouble();
        
        // Ask user to input item's quantity
        System.out.print("Enter item's quantity: ");
        int itemQuantity = input.nextInt();
        
        // Ask user to input item's discount
        System.out.print("Enter item's discount: ");
        int itemDiscount = input.nextInt();
        
        // Calculate total price
        double totalPrice = itemPrice * itemQuantity * (100 - itemDiscount) / 100;
        
        // Display invoice
        System.out.println("\n--- Invoice ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Item Quantity: " + itemQuantity);
        System.out.println("Item Discount: " + itemDiscount + "%");
        System.out.println("Total Price: " + totalPrice);
        
        // Ask user to input amount of money to pay
        System.out.print("\nEnter amount of money to pay: ");
        double moneyToPay = input.nextDouble();
        
        // Calculate change
        double change = moneyToPay - totalPrice;
        
        // Display change
        System.out.println("Change: " + change);
        
        // Close scanner
        input.close();
    }
}
