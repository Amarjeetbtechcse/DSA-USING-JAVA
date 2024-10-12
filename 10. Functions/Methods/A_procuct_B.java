public class A_procuct_B {
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 10; 
        int b = 50; 
        int product = multiply(a,b);
        System.out.println("a multiply by b is: " + product);
        product = multiply(10,10);
        System.out.println("a multiply by b is: " + product);
    }
}
