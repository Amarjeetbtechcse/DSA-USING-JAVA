public class largestOfThree {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        if((A>=B) && (A>=C)){
            System.out.println("largest is A");
        }
        else if(B>=C){
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
}
