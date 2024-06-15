import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FactorialExamples {

	//find factorial of
	//List<Integer> list=Arrays.asList(1000,2000,3000,4000,5000,6000);
	
	public static BigInteger calculate(int num) {
		
		BigInteger val=BigInteger.ONE;
		for(int i=2;i<=num;i++) {
			val=val.multiply(BigInteger.valueOf(i));
		}
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(4, 2,400,50,1230,45,987);
		long startTime = System.currentTimeMillis();
		//List<BigInteger> factorials = list.stream().map(FactorialExamples::calculate).collect(Collectors.toList());
// 		The above code is using method reference whereas below code is using lambda expression.
		List<BigInteger> factorials = list.stream().map((x)->calculate(x)).collect(Collectors.toList());
		
//		This is a block from lambda expression.
//		This form is used when the lambda body contains multiple statements or needs a block.		
//		List<BigInteger> factorials = list.stream().map((x)->{return calculate(x)}).
//		collect(Collectors.toList());		
		
// 		All the above 3 codes will work same.3rd one is used to perform some complex operations
//		along with calculating the factorial.		
		
		System.out.println("Rocky");
		for(BigInteger b:factorials) {
			System.out.println(b);
			System.out.println();
		}
		System.out.println("Bhai");
		
		
		
		
		
		long endTime = System.currentTimeMillis();
		
		long startTimeParallel = System.currentTimeMillis();
		List<BigInteger> factorials2 = list.parallelStream().map(x -> {
			System.out.println(Thread.currentThread());
			return calculate(x);

		}).collect(Collectors.toList());
		
		long endTimeParallel = System.currentTimeMillis();

		
//		for(BigInteger b:factorials) {
//			System.out.println(b);
//			System.out.println();
//		}
		
		for(BigInteger b:factorials2) {
			System.out.println(b);
			System.out.println();
		}
		
		System.out.println(" total time Stream  " + (endTime - startTime));
		
		System.out.println("total time Parallel Stream " + (endTimeParallel - startTimeParallel));
		//Fork join pool - mainly breaks the tasks into subtasks
		// until minimum task is enough to be solved 
		//when we have to do heavy computational task 
		//

		
		
		//suppose you want to write or update some value from system1 to system 2 
		// All these are indepents value in diffrent objects 
		//Submit all the values with metadata like table value and column name;
		//trigger some work flow when u get the response back 
		//Asyn operation 
		// 1 req take u to updates 60 network calls - time 
		//Bulk request - 1000 records 
		// 30ms - 100ms 
		//2 sec   - 2000ms
	//ExecutorService e=
	//ForkJoinPool	
	}

}
