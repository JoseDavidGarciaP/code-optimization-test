public class TaxCalculation {
    public static void main(String[] args) {
        //We create the arrangements for prices and percentages.
        /* 
        double productPrice1 = 100;
        double productPrice2 = 200;
        double tax1 = productPrice1 * 0.15;
        double tax2 = productPrice2 * 0.10; 
        */

        double [] productPrice = {100, 200};
        double [] discountPercentages = {0.15, 0.10};

        //We create the comparison constant for the total discountPercentages
        final int meter = 50;
        
        double totalDiscount = tax1 + tax2;
        
        if (totalDiscount > meter) {
            System.out.println("High total tax: " + totalDiscount);
        } else {
            System.out.println("Low tax");
        }
    }
}
