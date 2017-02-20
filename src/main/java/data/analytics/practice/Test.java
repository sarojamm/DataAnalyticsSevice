package data.analytics.practice;


import java.util.Arrays;

public class Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs ={"abc","ab","bc"};
		// strs =;
		 Arrays.sort(strs);
		String s ="";
		for(String str : strs){
			s+=str;
			
		}

		System.out.println (" This is a update." + s);
	}

}
