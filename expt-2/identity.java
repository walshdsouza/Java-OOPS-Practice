import java.util.*;
public class identity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n=sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter the element at position ("+(i+1)+","+(j+1)+"): ");
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j && mat[i][j]!=1){
                    System.out.println("The matrix is not an identity matrix.");
                    return;
                }
                else if(i!=j && mat[i][j]!=0){
                    System.out.println("The matrix is not an identity matrix.");
                    return;
                }
            }
        }
        System.out.println("The matrix is an identity matrix.");

    }
    
}
