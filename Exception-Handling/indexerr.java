import java .util.*;
public class indexerr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the index of the element you want to access(starting from 0): ");
        
        try{
            int index=sc.nextInt();
            System.out.print("The element at index "+index+" is: "+arr[index]);

        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Error: Index is out of bounds.");
        }
        sc.close();
    }
}
