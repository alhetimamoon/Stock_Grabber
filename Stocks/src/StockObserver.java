public class StockObserver implements Observer{
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0; 
	
	private int observerID; 
	
	
	//to gain access to the stock grabber class
	private Subject stockGrabber;
	
	public StockObserver (Subject stockGrabber){
		
		this.stockGrabber = stockGrabber; 
		
		//id for each created observer(Stock)
		this.observerID = ++observerIDTracker; 
		
		System.out.println("New observer" + this.observerID);
		
		stockGrabber.register(this);
		
	}
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice){
		
		
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
		
	}
	
	public void printThePrices(){
		
		System.out.print(observerID + 
				"\nIBM:" + ibmPrice +
				"\nAAPL: "+ aaplPrice + 
				"\nGOOG: "+ googPrice+
				"\n");
	}
	
	
}