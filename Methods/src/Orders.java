import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String order = scan.nextLine();

        double numOfOrders = Double.parseDouble(scan.nextLine());

        switch (order){
            case "coffee":
                getPriceCoffee(order,numOfOrders);
                break;
            case "water":
                getPriceWater(numOfOrders);
                break;
            case "coke":
                getPriceCoke(numOfOrders);
                break;
            case "snacks":
                getPriceSnacks(numOfOrders);
                break;
        }
    }

    private static double getPriceSnacks(double numOfOrders) {
        double result = numOfOrders*2.00;
        System.out.printf("%.2f",result);
        return result;
    }

    private static double getPriceCoke(double numOfOrders) {
        double result = numOfOrders*1.40;
        System.out.printf("%.2f",result);
        return result;
    }

    private static double getPriceWater(double numOfOrders) {
        double result = numOfOrders*1.00;
        System.out.printf("%.2f",result);
        return result;
    }

    private static double getPriceCoffee(String order, double numOfOrders) {
        double result = 1.50*numOfOrders;
        System.out.printf("%.2f",result);
        return result ;
    }
}
