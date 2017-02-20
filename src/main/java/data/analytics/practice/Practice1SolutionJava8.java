package data.analytics.practice;

import java.util.Arrays;
import java.util.Collections; 
import java.util.List;

public class Practice1SolutionJava8 {
  
 private static void printConditionally(List<Person> people, Condition c){
	 for(Person p : people){
		 if(c.test(p)){
			 System.out.println(p);
		 }  
	 }
  }
 interface Condition{
	 boolean test(Person p);
 }
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens", 60),
				new Person("Lewis","Carrol", 42),
				new Person("Thomas","Carlyle", 51),
				new Person("Charlotte","Bronte", 45),
				new Person("Matthew","Arnold", 39));
		
//		Step1: sort list by last name
		Collections.sort(people,  ( o1,   o2) -> o1.getLname().compareTo(o2.getLname())); 
		// step2: create a methos that prints all elements in the list
		printConditionally(people,p->true);
		 System.out.println(" ===========printConditionally last ============== ");
		//step 3: creatw a method that prints all people that gave last name beginnin with C
		 printConditionally(people,p -> p.getLname().startsWith("B"));
			
		 
		 System.out.println(" ============printConditionally first ============= ");
			
		printConditionally( people, p -> p.getFname().startsWith("T"));
	}

}
