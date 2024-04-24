public class CheckFunds {

    private double funds = 1000.00;

    public double getFunds(){
        return funds;
    }

    public boolean haveEnough(double amountDeposited){

        if(funds>amountDeposited){
            return true;
        }
        else{
            return false;
        }
    }

    public void deposit(double moneyAmount){
        funds=funds+moneyAmount;
        System.out.println("You have deposited " + moneyAmount + " in your account.");
        System.out.println("you currently have: $" + funds);
        
    }

    public void withdrawl(double amountDeposited){
        if(haveEnough(amountDeposited)==true){
            funds= funds-amountDeposited;
            System.out.println(amountDeposited + " withdrawn");
            System.out.println("you currently have: $" + funds);
        }
        else{
            System.out.println("You do not have enough funds in your account");
        }
    }

}
