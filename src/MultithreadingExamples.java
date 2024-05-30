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

	}
}
