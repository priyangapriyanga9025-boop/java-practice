import java.util.Scanner;

public class training {

    // Method to calculate tax
    public static double calculateTax(double income) {

        double tax = 0;

        if (income <= 300000) {
            tax = 0;
        } 
        else if (income <= 600000) {
            tax = (income - 300000) * 0.05;
        } 
        else if (income <= 900000) {
            tax = 15000 + (income - 600000) * 0.10;
        } 
        else if (income <= 1200000) {
            tax = 45000 + (income - 900000) * 0.15;
        } 
        else if (income <= 1500000) {
            tax = 90000 + (income - 1200000) * 0.20;
        } 
        else {
            tax = 150000 + (income - 1500000) * 0.30;
        }

        return tax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Income Tax = Rs. " + tax);

        sc.close();
    }
}