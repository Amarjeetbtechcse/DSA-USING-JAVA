import java.util.*;

public class ParamArguments{
   

    public static int CalculateSum(int a , int b){// Formal parameters or parameters
       
        int sum = a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int sum =CalculateSum(a,b);// arguments or actual parameters
        System.out.println("Sum is : "+sum);
    }
}
