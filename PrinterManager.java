import Singleton.Printer;

public class PrinterManager extends Printer{
    private static Printer singleInstance;
    private static PrinterManager[] printers;

    private PrinterManager() {
        
    }
    public static String getInstance() {

    }
    public static assignJob(String job){

        for(int i=0; i<printers.length; i++){ //search each printer until one is found that is not busy, then set it as busy and assign job
            if(printers[i].isBusy()==false){
                printers[i].setBusy(true);
                printers[i].setPrintJob(job);
            }
        }
    } 
    public static showStatus(){
        for(int i = 0; i<printers.length; i++){
            System.out.println("Printer "+ i + ":\nIs busy: " +
            printers[i].isBusy() + "\nPrint job: " + printers[i].getPrintJob() ); //prints the status of the printer and the job is it assigned
        }
    }
}
