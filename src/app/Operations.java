package app;

public class Operations {

    static String name;
    static int quota;
    static double price;
    static double salesAmount;
    static double avgSum;
    static int days;

    public static void main(String[] args) {

        name = "Apples";
        quota = 158;
        price = 2.99;
        days = 472;

        salesAmount = quota / price;
        System.out.println("Product: " + name + ", sales EUR " + salesAmount);

        avgSum = salesAmount;
        System.out.println("Product: " + name + ", sales by day EUR " + avgSum);

        name = "Apples";
        quota = 117;
        days = 7;

        salesAmount = avgSum / price;
        System.out.println("Product: " + name + ", sales EUR " + salesAmount);

        avgSum = salesAmount / days;
        System.out.println("Product: " +  " sales by day EUR " + avgSum);

    }
}
