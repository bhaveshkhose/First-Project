package MAIN_PACKAGE;

public class Transaction {
    private double amount;

    public void setamount(double amount){
        this.amount = amount;
    }

    public void creditMoney(double money){
        
        amount += money;
    }
    public void debitMoney(double money) throws IllegalArgumentException{
        if(money > amount ){
            throw new IllegalArgumentException("Insufficent balance amount in your account");
        }
        amount -= money;
    }

    public void   checkBalance(){

        if (amount < 0){
            System.out.println("Your account balance is Zero");
        }
        else{
            System.out.println("Your account balance is "+amount);
        }
        
    }


    
}
