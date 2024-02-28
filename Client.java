public class Client {

	public static void main(String[] args) {

		// get the singleton instance
		PrinterManager printerManager = PrinterManager.getInstance();
		// assign some job
		printerManager.assignJob("print something");
		printerManager.assignJob("print something again");
		// show status
		printerManager.showStatus();

		// check if you can get another instance
		PrinterManager printerManager2 = PrinterManager.getInstance();
		// show status
		printerManager2.showStatus();
	}

}
