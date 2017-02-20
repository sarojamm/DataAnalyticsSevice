package data.analytics.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice1SolutionJava7 {
 private static void printAll(List<Person> people){
	 for(Person p : people){
		System.out.println(p);
	 }
 }
 private static void printLastNameStartsWithC(List<Person> people){
	 for(Person p : people){
		 if(p.getLname().startsWith("C")){
			 System.out.println(p);
		 }
		    
	 }
  }
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
		Collections.sort(people, new Comparator<Person>(){
            @Override
			public int compare(Person o1, Person o2) {
				return o1.getLname().compareTo(o2.getLname());
			}
		});
		// step2: create a methos that prints all elements in the list
		printAll(people);
		 System.out.println(" ========================= ");
		//step 3: creatw a method that prints all people that gave last name beginnin with C
		printLastNameStartsWithC( people);
		 System.out.println(" ===========printConditionally last ============== ");
			
		printConditionally( people,new Condition(){ 
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLname().startsWith("C");
			}
			
		});
		 System.out.println(" ============printConditionally first ============= ");
			
		printConditionally( people,new Condition(){ 
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFname().startsWith("C");
			}
			
		});
	}

}
