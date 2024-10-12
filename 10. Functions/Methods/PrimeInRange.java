public class PrimeInRange {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        //for(int i = 2; i<= n-1; i++)
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
            return false;
        }
    }
           return true;
    }

    public static void Prime(int n ){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i +" ");
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Prime(50);
    }
}