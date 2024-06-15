import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {
	
//	Parallel Streams in Java allow you to process data concurrently, taking advantage of 
//	multi-core processors to improve performance. Parallel streams split the data into multiple
//	parts and process them concurrently in multiple threads. They can significantly improve 
//	performance for large datasets or computationally intensive tasks
//	To create a parallel stream, you can call the parallelStream() method on a Collection or 
//	use the parallel() method on an existing stream.	
	
//Sequential streams process data in a single thread, following the order of the source elements.
//They are simple and predictable but might not be as fast for large datasets or computationally
//intensive tasks.	
	
//	By default, the number of threads running in parallel in parallel streams is determined 
//	by Runtime.getRuntime().availableProcessors() - 1.	
//	the maximum number of threads that can run in parallel effectively is influenced by the 
//	number of processors (or cores) present in the system. This is because each processor core 
//	can handle one thread at a time without needing to switch contexts.
//	Each core can handle one thread simultaneously, so a system with 4 cores can effectively
//	run 4 threads in parallel without context switching.	
	
public static BigInteger calculate(int num) {
		
		BigInteger val=BigInteger.ONE;
		for(int i=2;i<=num;i++) {
			val=val.multiply(BigInteger.valueOf(i));
		}
		return val;
	}
	
	public static void main(String args[]) {
		
	List<Integer> list=Arrays.asList(1000,2000,3000,4000,5000,6000,7000,8000,9000,45,56,45,78,89,23,4665);
	List<BigInteger> factorial=list.parallelStream().
			map((x)->{
				System.out.println(Thread.currentThread());
				return calculate(x);}).collect(Collectors.toList());	
}
//	above code give o/p as below
//	Thread[main,5,main]
//	Thread[ForkJoinPool.commonPool-worker-3,5,main]
//	Thread[ForkJoinPool.commonPool-worker-2,5,main]
//	Thread[ForkJoinPool.commonPool-worker-1,5,main]
//	Thread[ForkJoinPool.commonPool-worker-3,5,main]
//	Thread[ForkJoinPool.commonPool-worker-1,5,main]
	
	// The no of ForkJoinPool worker threads is n-1 here n is number of core processors in the
	//system. We subtract 1 bcoz there is also main thread which is running.
	//Fork Join Pool is used when we are using ParallelStreams.
	//Fork join pool - mainly breaks the tasks into subtasks
	// until minimum task is enough to be solved 
	//when we have to do heavy computational task 
	//

}
