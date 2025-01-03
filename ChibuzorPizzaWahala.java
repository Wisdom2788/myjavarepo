import java.util.Scanner;

public class ChibuzorPizzaWhahala {
    public static void main(String... args) {

        String[] pizzaType = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int[] slicesInBox = {4, 6, 8, 12};
        int[] priceOfBox = {2500, 2900, 4000, 5200};

        Scanner wisdom = new Scanner(System.in);
         
		 System.out.println("Welcome to CHIBUZOR AND SONS pizza inc");
        System.out.print("Enter number of guests: ");
        int guests = wisdom.nextInt();

        System.out.println("Pizza type");
        System.out.println("0 = Sapa size");
        System.out.println("1 = Small Money");
        System.out.println("2 = Big boys");
        System.out.println("3 = Odogwu");
        System.out.print("Enter the pizza type: ");
        int pizzaTypeIndex = wisdom.nextInt();

        int slicesInBoxChoosen = slicesInBox[pizzaTypeIndex];
        int priceOfBoxChoosen = priceOfBox[pizzaTypeIndex];

        int boxNeeded = guests / slicesInBoxChoosen;
        if (guests % slicesInBoxChoosen != 0) {
            boxNeeded++;
        }

        int totalSlices = boxNeeded * slicesInBoxChoosen;
        int leftOvers = totalSlices - guests;

        int totalPrice = boxNeeded * priceOfBoxChoosen;

        System.out.println("Number of pizza boxes to buy = " + boxNeeded + " boxes");
        System.out.println("Number of leftOvers = " + leftOvers + " slices");
        System.out.println("Price = " + totalPrice);
    }
}
