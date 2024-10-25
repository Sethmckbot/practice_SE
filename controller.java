import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hello, Welcome to Fast Food ordering.\n");
            System.out.println("1. Mobile\n2. Other\n");
            System.out.println("Your Answer: ");

            Order order = new Order();

            String userinput = input.nextLine();
            int userChoice = Integer.parseInt(userinput);

            if(userChoice == 2)
            {
                order.startOrder();

                //System.out.println("Your Order: \n" + order.getOrder());

                //System.out.println("Total: \n" + order.getTotal());

                System.out.println("all done");
            }
        } catch (Exception e) {
            System.out.println("Error with Scanner");
        }
    }

}
