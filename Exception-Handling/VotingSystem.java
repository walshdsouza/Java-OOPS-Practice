import java.util.Scanner;

// Custom Exception (Requirement 17)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Voting Eligibility logic (Requirement 18)
public class VotingSystem {
    
    // Method that declares it might throw our custom exception
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is under 18. Not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = sc.nextInt();
            checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }finally{
            System.out.println("Closing...");
            sc.close();
        }
        
    }
}
