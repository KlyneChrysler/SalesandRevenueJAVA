import java.util.Scanner;

public class SalesandRevenue {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);

        String name;
        int quantity;
        double partialTotal, finalTotal, vatPrice, revenue = 0, totalSales = 0;
        final double discount = 0.1; //wa na gamit
        final double miscFee = 50000;
        final double price = 25000;
        final double inciFee = 5000;  
        final double vat = 0.12;

        for ( int x = 0; x < 3; x++ ) {
            System.out.print("ENTER NAME: ");
            name = scan.nextLine();
            if ( x == 0 ) {
                quantity = 3500;
                partialTotal = price * quantity;
                vatPrice  = partialTotal * vat;
                finalTotal = partialTotal + vatPrice;
                
                System.out.println("NAME:              " + name);
                System.out.println("QUANTITY:          " + quantity);
                System.out.printf("PRICE:             %,.2f\n",price);
                System.out.println("DISCOUNT:          N/A"); //0 or N/A?
                System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                System.out.printf("VAT:               %,.2f\n",vatPrice);
                System.out.println("----------------------------------");
                totalSales += finalTotal;
            } else if ( x == 1 ) {
                quantity = 4000;
                partialTotal = price * quantity;
                vatPrice  = partialTotal * vat;
                finalTotal = partialTotal + vatPrice;

                System.out.println("NAME:              " + name);
                System.out.println("QUANTITY:          " + quantity);
                System.out.printf("PRICE:             %,.2f\n",price);
                System.out.println("DISCOUNT:          N/A"); //0 or N/A?
                System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                System.out.printf("VAT:               %,.2f\n",vatPrice);
                System.out.println("----------------------------------");
                totalSales += finalTotal;
            } else if ( x == 2 ) { 
                quantity = 980;
                partialTotal = price * quantity;
                vatPrice  = partialTotal * vat;
                finalTotal = partialTotal + vatPrice;

                System.out.println("NAME:              " + name);
                System.out.println("QUANTITY:          " + quantity);
                System.out.printf("PRICE:             %,.2f\n",price);
                System.out.println("DISCOUNT:          N/A"); //0 or N/A?
                System.out.printf("TOTAL SALES:       %,.2f\n",partialTotal);
                System.out.printf("VATABLE SALES:     %,.2f\n",finalTotal);
                System.out.printf("VAT:               %,.2f\n",vatPrice);
                System.out.println("----------------------------------");
                totalSales += finalTotal;
            }  
        }
       //total_sales *= 12; //monthly sales?
        revenue = totalSales - ((miscFee * 12) + (inciFee));
        System.out.printf("MASTER SALES:       %,.2f\n",totalSales);
        System.out.printf("MASTER REVENUE:     %,.2f",revenue);
    }
}