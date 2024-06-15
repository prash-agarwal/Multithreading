package UserThread;

public class MyThread extends Thread {

	int rateOfDay;
	int noOfDays;
	Book b;
	int totalCost;
	
	public int getTotalCost() {
		return totalCost;
	}

	public MyThread(int rateOfDay,int noOfDays, Book b) {
		this.noOfDays=noOfDays;
		this.rateOfDay=rateOfDay;
		this.b=b;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		totalCost=costOfRent(rateOfDay,noOfDays,b);
		
		//run() method of a thread cannot return anything.
	}

	int costOfRent(int rateOfDay,int noOfDays, Book book) {
		
		int cost=rateOfDay*noOfDays;
		cost=cost+book.getBookPrice();
		return cost;
	}
	
}