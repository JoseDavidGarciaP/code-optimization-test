public class Store {
    public static void main(String[] args) {
        //The variables p(number) are changed to arrays
        /* 
        int p1 = 15;
        int p2 = 10;
        int p3 = 5; 
        */
        int [] price  = {15, 10, 5};

        //An array is created for the magic values ​​of the quantity
        int [] amount = {2, 3, 4};

        //We create the comparison constant for the total salts
        final int meter = 50;

        //We create a loop to calculate the totals
        /*   
        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;
         */ 
        int totalSales = 0;
        for (int i = 0; i < price.length; i++) {
            totalSales += (price[i]*amount[i]);
        }
        /* 
        int totalSales = total1 + total2 + total3;
        */
        //totalSales = 80;
        
        if (totalSales > meter) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
