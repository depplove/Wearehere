package ApnaBank;

import java.util.Scanner;
public class LoginPage {
    int pinValidator=1234;
    public void login(){
        int counter=0;
        System.out.println("Welcome to Apna Bank");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your pin to access your account");
        int pin=scanner.nextInt();
        if(!validator(pin,pinValidator)){
            for (int i=0;i<2;i++) {
                System.out.println("PIN is Invalid, Please try again");
                pin = scanner.nextInt();
                counter++;
                if (validator(pin, pinValidator) == false) continue;
            }
        }
        if(counter==2){
            System.out.println("Have you forgot your password ?, \n Do you want to change? press 1 to continue");
            int choice=scanner.nextInt();
            if(choice==1){
                System.out.println("Please create your PIN");
                pinValidator=scanner.nextInt();
                System.out.println("Successfully created! please login with new Pin");
                LoginPage loginPage=new LoginPage();
                loginPage.pinValidator=pinValidator;
                pin=scanner.nextInt();
                if(pin==loginPage.pinValidator){
                    validator(pin,loginPage.pinValidator);
                }else{
                    System.out.println("Your card has been blocked. Please visit your branch");
                }
            }
        }
    }

    boolean validator(int pin, int pinValidator){
        if(pin==pinValidator) {
            System.out.println("You have login successfully");
            System.out.println("Please choose one of the following services\n 1. Deposit         2. Withdraw\n 3. Balance         4. XYZ");
            int flag=1;
            Scanner nScanner= new Scanner(System.in);
            int choose= nScanner.nextInt();
            // Deposit money instantiate
            DepositMoney depositMoney= new DepositMoney();
            while(flag==1){
                if(choose==1){
                    System.out.println("Enter amount to deposit");
                    int depositAmount=nScanner.nextInt();
                    depositMoney.depositAmount(depositAmount);
                    System.out.println("Balance "+depositMoney.getAmount());
                }
                if(choose==2){
                    System.out.println("Enter amount to withdraw");
                    int withdraw = nScanner.nextInt();
                    depositMoney.withdraw(withdraw);
                    System.out.println("Balance "+ depositMoney.getAmount());
                }
                System.out.println("Want to continue? Press 1");
                flag=nScanner.nextInt();
            }

            return true;
        }
        return false;
    }

}
