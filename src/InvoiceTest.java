// Ex. 3.12: InvoiceTest
// Demonstrates class Invoice's capabilities

import com.company.Invoice;
import java.util.Scanner;

public class InvoiceTest {

   public static void main(String[] args){

      Invoice myInvoice = new Invoice("251628","Classic Cabinet Knob", 4, 1.29);

      //initial data
      System.out.printf("A part number: %s%n", myInvoice.getNumber());
      System.out.printf("A part description: %s%n", myInvoice.getDescription());
      System.out.printf("A quantity of the item being purchased: %s%n", myInvoice.getQuantity());
      System.out.printf("A price per item: %s%n", myInvoice.getPrice());
      System.out.printf("The invoice amount: %s%n", myInvoice.getInvoiceAmount());
      System.out.println();

      //create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      //get an input from user
      System.out.println("Please enter a part number: ");
      String theNumber = input.nextLine();
      myInvoice.setNumber(theNumber);

      System.out.println("Please enter a part description: ");
      String theDescription = input.nextLine();
      myInvoice.setDescription(theDescription);

      System.out.println("Please enter a quantity of the item being purchased: ");
      int theQuantity = Integer.parseInt(input.nextLine());
      myInvoice.setQuantity(theQuantity);

      System.out.println("Please enter a price per item: ");
      double thePrice = Double.parseDouble(input.nextLine());
      myInvoice.setPrice(thePrice);
      System.out.println();

      //display the results
      System.out.printf("A part number: %s%n", myInvoice.getNumber());
      System.out.printf("A part description: %s%n", myInvoice.getDescription());
      System.out.printf("A quantity of the item being purchased: %s%n", myInvoice.getQuantity());
      System.out.printf("A price per item: %s%n", myInvoice.getPrice());
      System.out.printf("The invoice amount: %s%n", myInvoice.getInvoiceAmount());
   }
}
