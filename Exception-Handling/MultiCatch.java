import java.util.*;
public class MultiCatch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        try{
            System.out.print("Enter the index to access(Starting from 0): ");
            int index=Integer.parseInt(sc.nextLine());
            System.out.println("The element at index "+index+" is: "+arr[index]);
            System.out.print("Enter number to divide each array element by:");
            int divisor=Integer.parseInt(sc.nextLine());
            for(int i=0; i<n; i++){
                System.out.println("Element "+(i+1)+" after division: "+arr[i]/divisor);
            }
        }catch (NumberFormatException e) {
            System.err.println("Error: Please enter valid numeric characters only.");
        }catch(ArrayIndexOutOfBoundsException ae){
            System.err.println("Error: Index is out of bounds.");
        }catch(ArithmeticException a){
            System.err.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
