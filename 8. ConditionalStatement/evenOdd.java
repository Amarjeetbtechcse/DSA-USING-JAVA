import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if ( number % 2 == 0){
            System.out.println("Given number is even.");
        }
        else{
        System.out.println("Given number is odd");
        }
    }
}
