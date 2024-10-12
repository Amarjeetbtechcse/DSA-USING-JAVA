import java.util.*;
public class oneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = sc.nextInt();
        int number = 1 ;
        while (number<=range){
            System.out.println(number);
            number++;
        }
    }
}
