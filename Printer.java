// Printer class
public class Printer {

	boolean isBusy; // shows if the printer is busy
	String printJob; // store the printing job
	
	// constructor
	public Printer(boolean isBusy, String printJob) {
		super();
		this.isBusy = isBusy;
		this.printJob = printJob;
	}
	
	// constructor
	public Printer() {
		super();
		this.isBusy = false;
		this.printJob = "";
	}

	public boolean isBusy() {
		return isBusy;
	}

	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

	public String getPrintJob() {
		return printJob;
	}

	public void setPrintJob(String printJob) {
		this.printJob = printJob;
	}
	
	
}
