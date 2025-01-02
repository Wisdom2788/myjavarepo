import java.util.Scanner;

public class MyLogistisServices1 {
  
     static int riderOne(int successfulDelivery1){
        int Parcel = 160, basePay = 5000; int dailyWage = 0;
        
        if (successfulDelivery1 <= 50) {
            dailyWage = (successfulDelivery1 * Parcel) + basePay;
             
        }
        return dailyWage;
    }

     static int riderTwo(int successfulDelivery2){
        int Parcel = 200, basePay = 5000; int dailyWageOne  = 0;

        if (successfulDelivery2 >= 50 && successfulDelivery2 <= 59){
            dailyWageOne = (successfulDelivery2 * Parcel) + basePay;
        }
        return dailyWageOne; 
    }

    static double  riderThree(int successfulDelivery3){
        int Parcel = 250, basePay = 5000; int dailyWageTwo = 0;

        if (successfulDelivery3 >= 60 && successfulDelivery3 <= 69){
            dailyWageTwo = (successfulDelivery3 * Parcel) + basePay;
        }
        return dailyWageTwo; 
    }

    static int riderFour(int successfulDelivery4){
        int Parcel = 500, basePay = 5000; int dailyWageThree = 0;

        if (successfulDelivery4 >= 70){
            dailyWageThree = (successfulDelivery4 * Parcel) + basePay;
        }
        return dailyWageThree; 
    }
    public static void main(String[] args) {
        
    //while (true) {
        System.out.printf("%s%n", "Welcome to Back To Sender Logistics Services oooooo...");
        
		int successfulDelivery1 = 45;
		 int successfulDelivery2 = 55;
		  int successfulDelivery3 = 66;
		   int successfulDelivery4 = 90;

        int totalWageOne = riderOne(successfulDelivery1);
        System.out.printf("%s%d%n", "Rider 1 daily wage: ", totalWageOne);
        System.out.printf("%d%s%d%n", successfulDelivery1, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalWageOne);


        int totalWageTwo = riderTwo(successfulDelivery2);
        System.out.printf("%s%d%n", "Rider 2 daily wage: ", totalWageTwo);
        System.out.printf("%d%s%d%n", successfulDelivery2, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalWageTwo);

        int totalWageThree = (int)riderThree(successfulDelivery3);
        System.out.printf("%s%d%n", "Rider 3 daily wage: ", totalWageThree);
        System.out.printf("%d%s%d%n", successfulDelivery3, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalWageThree);

        int totalWageFour = riderFour(successfulDelivery4);
        System.out.printf("%s%d%n", "Rider 4 daily wage: ", totalWageFour);
        System.out.printf("%d%s%d%n", successfulDelivery4, "(successful delivery) x 160(Amount Per Parcel) + 5,000(BasePay) = ", totalWageFour);

      }
        
    }
