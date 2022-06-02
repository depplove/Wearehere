package dee;

import java.util.Arrays;

public class AltMinMaxMin {

    public static void main(String[] args) {
        // calling method ; minor change compare to below code in if(condition)
        altMaxMin();


        int[] arr={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Printing original array: "+ Arrays.toString(arr));
        int[] newarr=new int[arr.length];
        int max=arr.length-1;
        int min=0;
        for(int i=1;i<=arr.length;i++){
            if (i%2==0){
                newarr[i-1]=arr[min++];
            }else{
                newarr[i-1]=arr[max--];
            }

        }
        System.out.println("New arr: "+ Arrays.toString(newarr));
    }
    // using boolean to change condition inside for loop in above code
    static void altMaxMin(){
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Printing original array: "+ Arrays.toString(arr));
        int[] newarr=new int[arr.length];
        int max=arr.length-1;
        int min=0;
        boolean flag=false;
        for(int i=0;i<=arr.length-1;i++){
            if (false){
                newarr[i]=arr[min++];
            }else{
                newarr[i]=arr[max--];
            }
            flag=!flag;
        }
        System.out.println("New arr: "+ Arrays.toString(newarr));
    }
}
