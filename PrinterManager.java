public class PrinterManager extends Printer{
    private static PrinterManager singleInstance;
    private Printer[] printers;

    private PrinterManager() {
        printers = new Printer[3]; //we dont know how many printers we are managing, gave random value 10
        for(int i = 0; i < printers.length; i++) {
            printers[i] = new Printer();
        }
    }
    //https://www.baeldung.com/java-private-constructors
    public static PrinterManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new PrinterManager();
        }
        return singleInstance;
    }
    public void assignJob(String job){
        boolean isAssigned = false;
        for(int i=0; i<printers.length; i++){ //search each printer until one is found that is not busy, then set it as busy and assign job
            if(printers[i].isBusy()==false){
                printers[i].setBusy(true);
                printers[i].setPrintJob(job);
                isAssigned = true;
                break;
            }
        }
        if (isAssigned == false) {
            System.out.println("No printer available");
        }
    } 
    public void showStatus(){
        for(int i = 0; i<printers.length; i++){
            System.out.println("Printer "+ i + ":\nIs busy: " +
            printers[i].isBusy() + "\nPrint job: " + printers[i].getPrintJob() ); //prints the status of the printer and the job is it assigned
        }
    }
}
