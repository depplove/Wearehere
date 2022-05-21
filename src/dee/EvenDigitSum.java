package dee;

public class EvenDigitSum {
    public static void main(String[] args) {
        EvenDigitSum evenDigitSum=new EvenDigitSum();
        // To reverse a number
        evenDigitSum.reverseNumber(123456789);
        // Sum of even digit of a number
        evenDigitSum.getEvenDigitSum(2343823);

    }

    int getEvenDigitSum(int num){
        int lastDigit,sum=0;
        if (num>=0){
            for (int i=num;i!=0;i/=10){
                lastDigit=num%10;
                if (lastDigit%2==0){
                  sum+=lastDigit;
                }
                num=num/10;
            }
            System.out.println("Sum of even digits of number: "+ sum);;
        }
        return -1;
    }
    void reverseNumber(int num){
        int lastdigit, sum=0;
        for (int i=num;i!=0;i/=10){
            lastdigit=num%10;
            sum=sum*10+lastdigit;
            num=num/10;
        }
        System.out.println("reverseNum "+ sum);
    }
}
