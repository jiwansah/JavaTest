package thread.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Runnable runnableTask = () -> {
			while(true) {
		    try {
		    	
		    		TimeUnit.MILLISECONDS.sleep(3000);
		    		System.out.println("Thread Runnable");
		    	
		    } catch (Exception e) {
		        e.printStackTrace();
		        return ;
		    }
			}
		};
		
		Callable<String> callableTask = () -> {
		    TimeUnit.MILLISECONDS.sleep(30);
		    System.out.println("Callable Task");
		    return "Task's execution";
		};

		try {
			
			List<Callable<String>> callableTasks = new ArrayList<Callable<String>>();
			callableTasks.add(()-> { TimeUnit.MILLISECONDS.sleep(30); System.out.println("I m in Callable"); return "Task's execution"; });
			
			executorService.execute(runnableTask);
			Future<String> future = executorService.submit(callableTask);
		
			String result = executorService.invokeAny(callableTasks);
			List<Future<String>> futureList = executorService.invokeAll(callableTasks);
			System.out.println(future);
			System.out.println(result);
			System.out.println(futureList);
			
			executorService.shutdown();

			
			ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
			Future<String> resultFuture = (Future<String>) scheduledExecutorService.scheduleAtFixedRate(()-> {
				System.out.println("scheduledExecutorService Thread");
				}, 100, 450, TimeUnit.MILLISECONDS);
			
			TimeUnit.MILLISECONDS.sleep(3000);
			scheduledExecutorService.shutdown();
	
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

		
	}

}
