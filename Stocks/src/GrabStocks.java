public class GrabStocks{
	
	public static void main(String [] args){
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer3 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(345.00);
		stockGrabber.setAAPLPrice(900.60);
		stockGrabber.setGOOGPrice(850.40);
	}
}