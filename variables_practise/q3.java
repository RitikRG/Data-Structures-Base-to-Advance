import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pen: ");
        float penCost = sc.nextFloat();
        System.out.print("Enter the cost of pencil: ");
        float pencilCost = sc.nextFloat();
        System.out.print("Enter the cost of eraser: ");
        float eraserCost = sc.nextFloat();

        double finalCost=1.18 * (penCost+pencilCost+eraserCost);
        System.out.println("Final Billing Amount: "+finalCost);
    }
}
