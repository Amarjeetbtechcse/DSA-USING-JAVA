  
import java.util.Scanner;

public class searchElement{
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j= 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found element at cell ("+i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][4]; // 3x4 matrix
        int m = matrix.length, n = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array in m*n format: ");
        
        // Input elements in matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Output elements in matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); // Print elements in the same row
            }
            System.out.println(); // Move to the next line after printing each row
        }

        search(matrix, 11);
    }
}
