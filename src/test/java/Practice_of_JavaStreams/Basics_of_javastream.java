package Practice_of_JavaStreams;
import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Basics_of_javastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Roshan");
		names.add("shubham");
		names.add("ghadge");
		names.add("sanjay");
		
		// To get count of names which are start with s 
		long n=names.stream().filter(s->s.startsWith("s")).count();
		System.out.println("Total count of names which are start with s are "+n);
		
		//to get the all the names into uppercase & print them 
		names.stream()
	     .filter(s -> s.startsWith(s)) // This filter condition doesn't make sense. It's checking if each string starts with itself. Assuming you want to filter strings that start with a specific prefix, you need to provide that prefix.
	     .map(s -> s.toUpperCase()) // This line is fine, but you can simplify it using method reference.
	     .forEach(System.out::println); // Here you need to use System.out::println to correctly reference the println method of the System.out object.
		
		
		ArrayList<Integer> ageArrayList=new ArrayList<Integer>();
		ageArrayList.add(20);
		ageArrayList.add(10);
		ageArrayList.add(250);
		ageArrayList.add(30);
		ageArrayList.add(50);
		
		//Practice set of javaStream Classes 
		long a=ageArrayList.stream().count();
		System.out.println("Total Number of count"+a);
		System.out.println(ageArrayList.stream().distinct().sorted());
		
		}
	

}
