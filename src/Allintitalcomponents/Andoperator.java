package Allintitalcomponents;

public class Andoperator {

    public static void main(String[] args) {

        int age = 19;
        String city = "agra";

        if (age > 18 & city == "agra") {
            System.out.println("He is eligible for voting in agra");

        } else {
            System.out.println("He is not eligible for voting");

        }
        age = 45;
        city = "pune";

        if (age < 18 & city == "pune") {
            System.out.println("He is eligible for voting in pune ");

        } else {
            System.out.println("he is not eligible for voting in pune");

        }

        age = 80;
        city = "Newdelhi";

        if (age < 60 & city == "Newdelhi") {
            System.out.println("He is and old man from delhi");

        } else {
            System.out.println("he is old man from outside delhi");
        }

        int rollnumber = 2;
        String div = "first division";
        int percentage = 75;

        if (rollnumber > 1 & div == "first division" & percentage > 70) {
            System.out.println("He is good student");
        } else {
            System.out.println("he is not good in study");

        }
        rollnumber = 3;
        div = "second division";
        percentage = 56;

        if (rollnumber > 1 & div == "second division" & percentage < 50) {
            System.out.println("He got second division" + percentage + rollnumber);

        } else {
            System.out.println("he got third dvision");

        }


    }}