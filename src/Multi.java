
public class Multi extends Thread{
	
//	 class named Multi that extends the Thread class. By extending Thread, 
//	 the Multi class inherits the properties and methods of the Thread class 
//	 and becomes a thread itself.
	
//We cannot override static methods in java. In Java, when a subclass declares a static
//method with the same signature as a static method in its superclass, it's not considered
//overriding, but rather method hiding.	
	
	@Override
	public void run(){  
		System.out.println("thread is running...");  
		}  

//	When you override the run method in the Multi class, the run method in the Multi class 
//	will be executed when you call the start method on an instance of Multi. This is due to the 
//	dynamic method dispatch (runtime polymorphism) in Java, which ensures that the overridden 
//	method in the subclass is executed, even if it is called from a method in the superclass.
//	Dynamic Method Dispatch: Java determines which method to call at runtime based on the actual 
//	object's type, not the reference type.
//	
//	Overriding Methods: When a method in a subclass overrides a method in the superclass, the
//	overridden method is called on the subclass instance.
//	Superclass Methods Calling Overridden Methods: When a superclass method calls an overridden 
//	method, the method defined in the subclass will be executed if the instance is of the 
//	subclass.
	
//	 In Java, any code that needs to run concurrently with the main program 
//	 should be put inside the run() method. This method is a key part of 
//	 multithreading in Java.
		  
//	The start() method tells the JVM to start executing 
//	the run() method concurrently in a new thread.	

		public static void main(String args[]){  
		Multi t1=new Multi();  
		t1.start();  
		System.out.println(Thread.currentThread());
	}  
}
//Method hiding: When a subclass declares a static method with the same signature
//as a static method in its superclass, it hides the superclass method rather than 
//overriding it. This means that the subclass method does not replace the superclass
//method in the inheritance hierarchy; instead, it simply hides it.
//Check more on this..

//t1.start() is used to start the execution of the thread t1, while t1.run()
//would directly call the run() method on the t1 object without starting a new thread.

//When start() is called, a new thread is created, and its run() method is executed 
//asynchronously in that thread.

//t1.run() method simply calls the run() method of the t1 object in the current thread 
//of execution without starting a new thread. It behaves like a normal method call and
//does not create a new thread. The run() method is executed synchronously in the same
//thread in which t1.run() is called.
