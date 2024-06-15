package UserThread;
import java.util.ArrayList;
import java.util.List;

public class OpsClass {

	public static void main(String args[]) {
		
		Book b1=new Book(1,"Silas",240);
		Book b2=new Book(2,"Rich Dad",340);
//		List<MyThread> list=new ArrayList<MyThread>();
//		
//		for(int i=0;i<list.size();i++) {
//			list.add(new MyThread(5,10));
//		}
		
		MyThread t1=new MyThread(5,10,b1);
		MyThread t2=new MyThread(7,10,b2);
		System.out.println(t1.currentThread()); //since the thread is'nt started thats why
		//it will give output as Thread[main,5,main]. Hence, no multi-threading took place.
		t1.start();
		System.out.println(t1.getTotalCost()); //o/p - 0 
		System.out.println("ThreadName "+t1.getName()+" ThreadPriority "+t1.getPriority()
		+ " ThreadGroupName "+t1.getThreadGroup()); //o/p -> ThreadName Thread-0 ThreadPriority 5 ThreadGroupName java.lang.ThreadGroup[name=main,maxpri=10]
		//t1.currentThread();
		System.out.println("Thread.currentThread() "+Thread.currentThread()); //Thread.currentThread() Thread[main,5,main]
		t2.start();
		//System.out.println(Thread.currentThread());
		System.out.println("Completed");
		System.out.println(t1.getTotalCost());
		// Difference between Callable and Runnable Interface.
		//can we create a thread inside main thread()
		//Different ways through we can create a object of a class in java.
		
		
		//Since in main method we are executing main thread hence wherever inside main thread
		//we print Thread.currentThread(), we will get details about main thread only.
		//If we use the name of thread to print the details of the thread that we have created ,
		//like t1.getName() then we will be getting the details of that particular thread
		//on a condition that thread t1 has started.
		//Example used above as t1.getName();
		
		//We can get the details of the user created thread also but if we use the method
		//Thread.currentThread() inside the run() method of the thread that we have created.
		
		//Code output :
//		
//		Thread[main,5,main]
//		0
//		Thread[main,5,main]
//		Completed
//		0
//		Thread[Thread-0,5,main]
//		Thread[Thread-1,5,main]

// The output of the code is not in sequence bcoz while t1 and t2 go for exection, main thread
// moves ahead without printing their o/p		
		
// The second line of the above output is 0 bcoz thread t1 is still in execution and it has'nt got
//	completed. Till then in between main() thread executes the print statement and it prints 0.
// On last third line of the output we can see that value that thread is returning got updated to 290.
// Its bcoz thread t1 completed it's execution when main() thread came to print the value of it and
// that's why it gave the correct value of it.
		
// To avoid this kind of ambiguity join() method is used. The thread.join(); method in Java is used to 
// ensure that the current thread waits until the thread on which join() was called has 
// finished its execution. This is particularly useful when you need to make sure that a certain 
// thread completes its task before the main thread or any other thread continues execution.

// Here the t1.join(); call makes the main thread wait until the t1 thread finishes 
// its execution. This ensures that the main thread does not proceed until the calculation in the 
// t1 thread is complete.	
//Once the user created thread t1.join(); returns, it means the t1 has completed its execution.
//The main thread can now safely access the result beyond it.
		
//		Use Cases for join()
		
//		Synchronizing Threads:
//		Ensuring one thread completes before another starts. For instance, waiting for a 
//		data processing thread to finish before starting to save or display results.
//		
//		Sequential Execution:
//		Managing sequential execution in a multi-threaded environment where specific tasks must be 
//		performed in order.
		
//		Resource Management:
//		Avoiding resource conflicts by ensuring that a thread has completed its task before other 
//		threads access shared resources.		
//		
	}
}
