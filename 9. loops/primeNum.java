public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check no is prime or not : ");
        int number = sc.next.Int();
        
        boolean isPrime = true;
        for (int i = 2 ; i<= number; i++){
            if(number% i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
