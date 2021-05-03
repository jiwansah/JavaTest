package logicTest.array;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ActiveTrader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> customers = new ArrayList<String>();
		customers.add("Jiwan");customers.add("Jiwan");customers.add("Jiwan");
		customers.add("Sah");customers.add("Sah");customers.add("kumar");
		
		Map<String, Long> result = customers.stream().collect(Collectors.groupingBy(
	            Function.identity(), Collectors.counting()
	        ));
	        
		DecimalFormat df = new DecimalFormat("#.##");
		
	        List<String> listResult = new ArrayList<String>();
	        result.forEach((k, v) -> {
	        	double v1 = v;
	        	double d = (v1*100)/customers.size();
	        	double p = Double.parseDouble(df.format(d));
	        	if(p>=5.00) {
	        		listResult.add(k);
	        	}
	        } );
	        
	        List<String> sortedList = listResult.stream().sorted().collect(Collectors.toList());
	        System.out.println( sortedList );
	}

}
