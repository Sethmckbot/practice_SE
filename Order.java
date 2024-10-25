import java.util.Scanner;

public class Order {

    public void startOrder()
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1.Meal \n2.Drink \n3. Food item\n0. Exit");
            System.out.println("Your Answer: ");

            String userinput = input.nextLine();
            int userChoice = Integer.parseInt(userinput);

            while(userChoice != 0)
            {
                if (userChoice == 0)
                {
                    System.out.println("option 0");
                }
                else if(userChoice == 1)
                {
                    System.out.println("option 1");
                }
                else  if (userChoice == 2)
                {
                    System.out.println("option 2");
                }
                else  if (userChoice == 3)
                {
                    System.out.println("option 3");
                }

                System.out.println("1.Meal \n2.Drink \n 3. Food item\n");
                System.out.println("Your Answer: ");
                userinput = input.nextLine();
                userChoice = Integer.parseInt(userinput);
            }
            
            
        }
        catch (Exception e) {
            System.out.println("Error with Scanner");
        }
    }
    
}
