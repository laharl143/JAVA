//Objective: When it comes to $24000, we don't care about cents. Print each value as a whole number (24309), not a decimal (24309.65).

public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int roundedSales = (int)sales;
        int roundedProfit = (int)profit;
        int roundedRefunds = (int)refunds;
        int roundedShipping = (int)shipping;

        System.out.println("This month, we made $" + roundedSales + " in sales");
        System.out.println("Factoring in costs, we made $" + roundedProfit+ " in profit");
        System.out.println("The refunds are at a low $" + roundedRefunds + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + roundedShipping + "  in shipping");

    }
}
/*
final output:
This month, we made $24309 in sales
Factoring in costs, we made $18562 in profit
The refunds are at a low $688. This is a good sign!
Shipping costs were high. We paid $1233  in shipping
 */