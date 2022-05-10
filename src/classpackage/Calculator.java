package classpackage;

public class Calculator {

 public void sub (int a, int b){

     int sub=a-b;
     System.out.println("Remaining Value  is ..."+sub);}
    public void add(int A, int B){
        int add=A+B;
        System.out.println("This is sum of A nd B "+add);

    }
    public void into(int c, int d){
     int mu=c*d;
       System.out.println("this is multiplication of c and d"+mu);}
    public void divide(int e, int f){
     int div=e/f;
     System.out.println("This is dividation of e and f"+div);

    }

        public static void main(String[] args) {

         Calculator calculator=new Calculator();
         calculator.sub(56,78);
         calculator.add(98,76);
         calculator.into(7,8);
         calculator.divide(81,9);


        }





            }










