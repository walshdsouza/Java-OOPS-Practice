import java.util.*;
public class Cities{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        LinkedList<String> cities = new LinkedList<>();
        
        while(true){
            System.out.print("Enter the cities(type exit to stop): ");
            String c=sc.nextLine();

            if(c.equalsIgnoreCase("exit")){
                break;

            }
            else if(!c.trim().isEmpty()){
                cities.add(c);

            }
            else{
                System.out.println("Invalid input. Please enter a valid city name.");
            }

        }
        if(cities.isEmpty()){
            System.out.println("No cities were enterred.");
            System.out.print("Number of cities: 0");
        }
        else{
             System.out.println("List of Cities:");
            for(String city:cities){
                System.out.println(city);

            }
            System.out.print("Number of cities: " + cities.size());

        }
       
        sc.close();
    }
}
