public class ExampleCreationThread implements Runnable{
	//Another way of creating thread other than shown in class ThreadCreation Class.
	//Runnable is a Functional Interface in java.	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run Method:MyThread "+Thread.currentThread());
		System.out.println("Inside Run Method:MyThread "+Runtime.getRuntime().availableProcessors());
		//4 available Processors for this system.
		System.out.println("Inside Run Method:MyThread "+Runtime.getRuntime().totalMemory());
		//totalMemory() gives you to get the total memory available in the JVM.
		//The totalMemory() returns both the heap memory and the non-hashed memory.
		//The output is in Bytes to convert that into MB(Megabytes) and divide it by (1024*1024).
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExampleCreationThread obj=new ExampleCreationThread();
		Thread th=new Thread(obj);
		//th.run();  //  o/p - Inside Run Method : MyThread Thread[main,5,main]
		//Runnable Interface Provides the run() method which is implemented here by
		//ExampleCreationThread class but thread class consists of the start() method which is 
		//responsible for starting the thread and that's why we are passing the refernce
		//variable of ExampleCreationThread in thread class.
		
		//if we run thread using run method then the o/p will be Thread[main,5,main] bcoz 
		//run method never creates a thread, instead it runs in a existing thread.
		//We cannot start a thread twice as it will give error as IllegalThreadStateException.
		
		
		th.sleep(10000);//It will move the thread to sleep state for 10 seconds.
		//It will give checked exception of InterruptedException.
		
		th.setPriority(8);
		th.start(); //  o/p - Inside Run Method:MyThread Thread[Thread-0,5,main]
		//Like in above using start method creates a new thread Thread[Thread-0,5,main]
		
		//Thread Priority - thread with higher priority will be executed first.
		//If there are more than 1 thread with same priority, then it they will be scheduled with 
		//the help of threadScheduler in java.
		//Not sure but they can be picked up randomly.
		
		//Synchronized Block - Only a single thread can access start() method at a 
		//given point of time.
		
		//JVM internally cannot create thread on it's own. That's why inside the thread class
		//implementation it calls start0() method which is native method and it interacts 
		//with os library to create the thread.
		
		System.out.println("Thread priority "+ th.getPriority());
	}
//	Thread priority 8
//	Inside Run Method:MyThread Thread[Thread-0,8,main]
//	Inside Run Method:MyThread 4
//	Inside Run Method:MyThread 199229440 ~ 190MB

}
