package Synchronization;                  
public class OperationClass {               
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Inside OperationClass");
		BankAccount bankAccount = new BankAccount(1, "jdbl_61", 5000.0);
		BankAccount bankAccount2 = new BankAccount(2, "jdbl_62", 5200.0);
		//Fork join is widely used in completable future and paralel stream.
		//actual output  = 5100
		MyThread t1 = new MyThread(true, 500.0, bankAccount);
		MyThread t2 = new MyThread(false, 400.0, bankAccount);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t1.currentThread();
	System.out.println("Current balance " + bankAccount.getBalance());
	//output of above code.
//	Inside OperationClass
//	Inside run method : Mythread
//	exmaple 51 
//	Inside run method : Mythread23 remainder 
//	Inside run method : Mythread
//	exmaple 51 
//	Inside run method : Mythread23 remainder 
//	Current balance 5100.0
// In above code both the thread tries to access the run method at a single time.
//	As thread1 goes in sleep state after printing Inside OperationClass, thread2 accesses the run 
// method. Synchronized block helps in avoiding the different threads to access it at a given point
	// of time.
	//code is not working properly without using 
//	t1.join();
//	t2.join(); in this...plz check
	}
}