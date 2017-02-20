package data.analytics.practice;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda sll = (String s)-> s.length();
        System.out.println(sll.getLength("Hello Lambda	StringLengthLambda sll = (String s)-> s.length();"));
        StringLengthLambda sll2 =   s-> s.length();
        System.out.println(sll2.getLength("Hello Lambda	StringLengthLambda sll = (String s)-> s.length();"));

	}
    interface StringLengthLambda{
    	int getLength(String s);
    }
}
