import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':System.out.println("sum is :"+(a+b));
                     break;
            case '-':System.out.println("subtract is :"+(a-b));
                     break;
            default:System.out.println("sorry");
        }
    }
}
