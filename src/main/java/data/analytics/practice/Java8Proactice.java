package data.analytics.practice;

public class Java8Proactice {
/*
 * myLambdaFunction = () -> System.out.println(" Test lambda expression example");
 * stringLengthCountFunction =(String s) -> s.length();
 * safeDevision = (int a , int b) -> {
 *  if(b == 0) return 0;
 *  else return  a/b;
 *  }
 * */
	public void greet(Greeting greeting){
		// java 7
		greeting.perform();
	}
	interface MyLambda{
		void foo();
	}
	interface MyAdd{
		int add(int x, int y);
	}
	public static void main(String[] args) {
		Java8Proactice jp = new Java8Proactice();
		
		MyLambda myLambdaFunction = () -> System.out.println(" Test lambda expression example");
		MyAdd myadd = (int a , int b ) -> a+b;
		// Anonymous innerClass
		Greeting innerClassGreeting = new Greeting(){
			public void perform(){
				System.out.println(" Test lambda expression example");
			}
		};
	}

}
