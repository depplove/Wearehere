package dee;

public class SharedDigit {
    public static void main(String[] args) {
        SharedDigit sharedDigit= new SharedDigit();
        System.out.println(sharedDigit.hasSharedDigit(34,73));

    }
    boolean hasSharedDigit(int a, int b){

        if (a>=10 && b<=99){
            int b1=b;
            while(b1>0){
                while(b>0){
                    if(a%10==b%10) return true;
                    b/=10;
                }
                System.out.println("b1 "+b1);
                if (a/10==b1%10) return true;
                b1/=10;
            }
            return false;
        }
        return false;
    }
}
