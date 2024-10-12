
import java.util.*;

public class typePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.print(b*a);  
    }
    
}




// import java.util.*;

// public class typePromotion {
//     public static void main(String[] args) {
//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;
//         double answer = a + b + c + d;
//         System.out.print(answer);  
//     }}

import java.util.*;

public class typePromotion {
    public static void main(String[] args) {
        byte a = 10;
        a = (byte)(a*2);
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double answer = a + b + c + d;
        // System.out.print(answer);  
    }}