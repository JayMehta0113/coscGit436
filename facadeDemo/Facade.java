public class Facade {

    private int accountNumber;
    private int pin;

    AccountNumber accChecker;
    PinChecker pinChecker;
    CheckFunds fundChecker;


    public Facade(int getAccNumber, int getPinNumber){
        accountNumber = getAccNumber;
        pin = getPinNumber;

        accChecker = new AccountNumber();
        pinChecker = new PinChecker();
        fundChecker = new CheckFunds();
    }

    public boolean checkInfo(){
        if((accChecker.activateAccount(accountNumber)&&pinChecker.activateAccount(pin))==true){
            return true;
        }
        else{
            System.out.println("Account number or pin number incorrect");
            return false;
        }
    }

    public void makeDeposit(double amountDeposited){

        if(checkInfo()==true){
            fundChecker.deposit(amountDeposited);
        }
        
    }

    public void makeWithdrawl(double amountDeposited){

        if(checkInfo()==true){
            fundChecker.withdrawl(amountDeposited);
        }
    }



}
