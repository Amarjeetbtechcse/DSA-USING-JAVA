public class overloading {
    //function to call int number
    public static int sum(int a , int b){
        return a+b;
    }
    //function to call float number
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(8 ,9));
        System.out.println(sum(8.22f ,9.25f));
    }
}
