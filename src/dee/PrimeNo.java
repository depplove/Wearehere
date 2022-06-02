package dee;
public class PrimeNo {
    public static void main(String[] args) {
        System.out.println(checkPrime(8));
    }
    static int checkPrime(int num){
        if(num==0|| num==1) return -1;
        if(num==2) return -1;
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return -1;
            }
           count++;
        }
        return count+2;
    }
}
