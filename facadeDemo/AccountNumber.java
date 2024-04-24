public class AccountNumber {
    
    private int accNumber = 987654321;

    public int getAccountNumber(){
        return accNumber;
    }

    public boolean activateAccount(int number){

        if(number==accNumber){
            return true;
        }
        else{
            return false;
        }

    }

}
