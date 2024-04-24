public class PinChecker{

    private int pin = 0113;

    public int getPinNumber(){
        return pin;
    }

    public boolean activateAccount(int pinEntered){

        if(pinEntered==pin){
            return true;
        }
        else{
            return false;
        }
    }

}
