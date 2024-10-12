public class OverloadingFunction {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }  
 public static void main(String args[]){
    System.out.println(sum(8,5));
    System.out.println(sum(8,5,8));
}
}