import java.util.Scanner;
import java.util.Vector;
public class VectorInteger{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        System.out.println("--- Vector Input Manager ---");
        System.out.println("Enter integers to add to the Vector.");
        System.out.println("Type 'done' when you are finished.");
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Check for the exit command
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            else if(!input.trim().isEmpty()){
                numbers.add(Integer.parseInt(input));
            }
            else{
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        System.out.println("Numbers in the Vector: " + numbers);
        scanner.close();
    }
}
