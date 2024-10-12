public class CallByValue {
    public static void swap( int a , int b) {
        // a  =5;
        // b = 10;
        
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a == "+a);
        System.out.println("b == "+b);
    }
    public static void main(String[] args) {
        int a  =10;
        int b = 15;
        
        // int temp = a;
        // a=b;
        // b=temp;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        swap(a,b);
    }
}
