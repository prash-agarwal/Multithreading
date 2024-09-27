//Even if we dont extend Thread class, then also it's working fine here.
//We can also create thread without extending Runnable Interface or Thread class.
//We can define override run() method of Thread class by using Lambda Expression.
public class UnderstandingThreadInBetterWay{

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Thread.join(); join() is an instance method that needs to be called on an instance of a 
		//Thread object. The join() method is used to wait for a specific thread to finish its 
		//execution. join() is a non-static method.
		//start() method is non-static method.
		
		//the sleep() method in Java is a static method of the Thread class, not an instance 
		//method. This means that sleep() affects the currently executing thread, no matter which 
		//thread calls it.
		
		Thread t1=new Thread(()->System.out.println("Thread t1 is starting"));
		t1.start();
		System.out.println("hello world");
		//What are Instance Variables.
		//How are they alloted memory in JAVA
	}
}
