/*
Sam runs a local musical equipment store in your neighbourhood.
He has contracted you to create an interactive application that will assist him with customer purchases.
Create a class named Customer Purchases that will contain get and set methods for a customer number,
first name, surname, product, price and quantity. Create a separate class called Printing that
 will include a method called Print Details, that will print the Customer Invoice. In the Printing class include another
  method called Customer Purchase Report which will display the following information:
REPORT OPTION PERCENTAGE TAX 15% COMMISSION 8.5% DISCOUNT 10% TOTAL (Price + Tax) – (Discount + Commission)
 */
import java.util.Scanner;

public class CustomerPurchase {
    private static int customerNumber;
    private int quantity;
    private String firstName, surname, product;
    private double price;


    public CustomerPurchase(String fn, String sn, String pr, double p, int q) {
        firstName = fn;
        surname = sn;
        product = pr;
        price = p;
        quantity = q;
        customerNumber++;
    }


    public int getCustomerNumber() {
        return customerNumber;
    }


    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getProduct() {
        return product;
    }


    public void setProduct(String product) {
        this.product = product;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    static class Printing {


        public static void printlnDetails(CustomerPurchase cp) {
            System.out.println("Customer invoice of " + cp.getFirstName() + " " + cp.getSurname() + " is : $ "
                    + cp.getPrice() * cp.getQuantity());
        }


        public static void customerPurchaseReport(CustomerPurchase cp) {
            double price = cp.getPrice();
            System.out.println("REPORT OPTION");
            System.out.format("%s %.2f \n", "PERCENTAGE TAX 15% : $", price * 0.15);
            System.out.format("%s %.2f \n", "COMMISSION 8.5% : $", price * 0.085);
            System.out.format("%s %.2f \n", "DISCOUNT 10% : $", price * 0.1);
            System.out.format("%s %.2f \n", "TOTAL (Price + Tax) – (Discount + Commission) = $",
                    (1 + 0.15 - 0.1 - 0.085) * price);
        }


    }


    public static void main(String args[]) {
        CustomerPurchase guitar = new CustomerPurchase("Dan", "Stevens", "Fender Stratocaster guitar", 250, 1),
                drum = new CustomerPurchase("Thomas", "Richardson", "Hoshino Gakki drum", 120, 3),
                micro = new CustomerPurchase("Leila", "Ambers", "Fujimi Boya BY-WHM8 microphone", 53, 2);
        Printing.printlnDetails(guitar);
        Printing.customerPurchaseReport(guitar);
        Printing.printlnDetails(drum);
        Printing.customerPurchaseReport(drum);
        Printing.printlnDetails(micro);
        Printing.customerPurchaseReport(micro);
    }
}

