package Alloperator;

import java.util.Scanner;


public class Lottery {
    public static String hasWon(int rand, int num){
        String won="";
        if (rand==num){
            won="You won";
        }
        return won;
    }

    public static void main(String[] args) {
        double  random=Math.random()*7+1;
        int rand=(int) random;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name to play");
        String name= scanner.nextLine();
        System.out.println("Please enter your age:");
        int age=scanner.nextInt();

        if(age>=18){
            System.out.println("Please enter a number");
            int num=scanner.nextInt();
            while (!(rand==num)) {
                System.out.println("You lose please try again");
                System.out.println("Please enter a number");
                num = scanner.nextInt();
            }
            System.out.println(Lottery.hasWon(rand,num));;
            }else {
            System.out.println("Abbe baccha hai tu, pogo dekh");
        }


        }

    }
