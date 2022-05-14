package Alloperator;

import java.util.Scanner;

public class OperatorsPractice {
    // Defining variables


    public static void main(String[] args) {
        String name = "Maanu";
        String otherName = "Dhiru";
        int rollNo = 21;
        int otherRollNo = 22;
        double randomNum=(Math.random()*4)+1;
        int rand= (int) randomNum;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fName= scanner.nextLine();
        System.out.println("Please enter you occupation: ");
        String occ= scanner.nextLine();
        System.out.println("please tell your salary");
        int salary=scanner.nextInt();
        System.out.println("My nane is "+fName+", my occupation is "+occ+"and my salary is"+salary);
        int[] intArray={1,2,3,4,5,6,7};
        //Scanner scanner= new Scanner(System.in);
        System.out.println("Please, Enter a number:");
        int num= scanner.nextInt();

        while (!(intArray[4]==num)){
            System.out.println("You lose, Please try again!");
            System.out.println("Please, Enter a number:");
            num= scanner.nextInt();
        }

        System.out.println("You won 1000 rupees");
        String fname= scanner.nextLine();
        System.out.println("Hey "+fName+" Verification successful. You will get your amount shortly");



        /*if ((name=="Maanu" && rollNo==21)&&!(otherName=="Dhiru" && otherRollNo==21)) {
            System.out.println("We got true");
        }else {
            System.out.println("We got false");
        }*/
    }

}
