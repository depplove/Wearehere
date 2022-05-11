package Alloperator;

public class EndOperator {
    public static void main(String[] args) {

        //Statement 1---> Both statement are true but we are using end operators so the true is converting in false
        int Age=19;
        String Name="Manvendra";
        if(!(Age>20))
        if(!(Name=="Manvendra"))
        {System.out.println("His name is " + Name + "and his age is"+ Age);}
        else{System.out.println("His name is not " + Name + " and his age is not  " + Age);}

        //Statement 2---> Both statement are false but end operators is converting them in true

        Age=25;
        Name="Dheeru";

        if (!(Age==26))
        if(!(Name=="Manu")) {
            System.out.println("His name is  " + Name  +  " and his age is " + Age);

        }
    else {
            System.out.println("His name is not" + Name + "and his age is not" + Age);
        }}}

