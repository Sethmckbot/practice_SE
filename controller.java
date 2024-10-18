import java.util.Scanner;

public class controller {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hello, Welcome to Fast Food ordering, How can I help you?");
            System.out.println("1. Order Meal \n2. Order Drink \n3. Other \n");
            System.out.println("Your Answer: ");

            String userinput = input.nextLine();



            System.out.println(userinput);
        } catch (Exception e) {
            System.out.println("Error with Scanner");
        }
    }

}
