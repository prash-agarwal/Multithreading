
public class ThreadCreation{
	//We can create user defined threads in 2 ways:
	//1. Runnable Interface.
		 //Runnable is a Functional Interface.
	//2. by extending thread class.
	//we can use both but using runnable interface leverages us to acheive multiple inheritance
	//and making the application Loosely Coupled.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		We are attempting to create an instance of 
//		an inner class (MyThread) from a static context (main method). Since MyThread 
//		is a non-static inner class, it requires an instance of the outer class (ThreadCreation)
//		to be instantiated.
		
//		InnerClass is a non-static inner class member of OuterClass. To create an instance 
//		of InnerClass, we first create an instance of OuterClass (outer), and then use 
//		that instance to create an instance of InnerClass (inner). After creating the 
//		inner object, you can use it as needed.

	//To create object of Inner Class, We need to create object of main Class First.
		ThreadCreation obj=new ThreadCreation();
		MyThread thread=obj.new MyThread();
		//starting the thread
		Thread t1=new Thread(thread);
		t1.start();
	}
	
//Inner Class
	public class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method: Mythread");
	}
}
}