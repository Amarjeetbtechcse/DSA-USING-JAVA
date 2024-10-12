
import java.util.*;

public class ReturnParameter{
    public static int printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3;
    }

    public static int CalculateSum(int a , int b){
       
        int sum = a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        printHelloWorld();// this is function call 
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int sum =CalculateSum(a,b);
        System.out.println("Sum is : "+sum);
    }
}
