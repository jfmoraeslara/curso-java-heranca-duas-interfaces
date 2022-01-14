package devices;

public class Print extends Device {

	public Print(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);		
	}
	
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}	

}
