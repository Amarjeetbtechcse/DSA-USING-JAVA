import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f; 
    }
    public static void main(String[] args) {
        // factorial(4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int fac = sc.nextInt();
        System.out.println(factorial(fac));
    }
}