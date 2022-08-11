package dee;
public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(checkPrime(44));
    }
    static String checkPrime(int num){
        if(num==0|| num==1) return num+" is not a prime no.";
        if(num==2) return num+" is a prime no.";
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0) {
                return num+" is not a prime no.";
            }
        }
        return num+" is a prime no.";
    }
}
