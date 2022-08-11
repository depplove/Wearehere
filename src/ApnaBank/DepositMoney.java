package ApnaBank;

import java.util.Scanner;

public class DepositMoney {
    int amount=1000;
    void depositAmount(int deposit){
        this.amount+=deposit;
    }

    public int getAmount() {
        return amount;
    }
    public void withdraw(int money){
        if(this.amount<=0 || this.amount<money){
            System.out.println("You dont have enough balance");
        }
        this.amount-=money;
    }
}
