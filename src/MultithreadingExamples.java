public class MultithreadingExamples {
	public static void main(String[] args) {
		//how many core - 1 
		//One task can only begin before other is completed
		//they will never run at same time
		//they might be veryfast becoz of context switching
		//multiple core case
		//its is ability to exceute independent task at same instant of time
		//to get the current running thread.
		System.out.println(Thread.currentThread());
		//o/p - Thread[main,5,main]
		//first part - name of the thread
		//second part - priority of thread
		//third part - group from where the thread is originating. 
		
		System.out.println(Thread.currentThread().getName());
		//o/p - to get the name of current running thread.
		
		System.out.println(Thread.currentThread().getPriority());
		//gives the priority.
		//min priority can be 1
		//max priority can be 10
		
		System.out.println(Thread.currentThread().getThreadGroup());
		//gives the group.
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		//to get the no. of cores in the system - 4
		
		//groupname - where the thread was launched from. when ever you create a thread it attaches a group to it. 
		//priority - elite customer should be attended or first asap.

		
		//Difference between thread.run() and thread.start()
		
		//When a program calls the start() method, a new thread is created and then the run() 
		//method is executed. But if we directly call the run() method then no new thread will 
		//be created and run() method will be executed as a normal method call on the current 
		//calling thread itself and no multi-threading will take place.
		
		//In Java’s multi-threading concept, another most important difference between start() 
		//and run() method is that we can’t call the start() method twice otherwise it will throw
		//an IllegalStateException whereas run() method can be called multiple times as it is 
		//just a normal method calling. 
		
		
	}
}
