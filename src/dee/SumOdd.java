package dee;

public class SumOdd {

    public static void main(String[] args){
        SumOdd sumOddObj=new SumOdd();
        System.out.println(sumOddObj.sumOdd(2,9));
    }

    boolean isOdd(int num){
        return num > 0 && !(num % 2 == 0);
    }

    int sumOdd(int start, int end){
        int sum=0;
        if(start>0 && end>0 && end>=start){
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sum=sum+i;
                }
            }
            return sum;
        }
        return -1;
    }
}
