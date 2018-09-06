package com.company;

public class Main {

    public static void main(String[] args) {
	
	    String equation1 = "79 + 3 * (4 + 82 - 68) - 7 + 19";
	    String equation2 = "(179 + 21 + 10) / 7 + 181";
	    String equation3 = "10389 * 56 * 11 + 2246";
	    
	    int solution1 = 79 + 3 * (4 + 82 - 68) - 7 + 19;
	    int solution2 = (179 + 21 + 10) / 7 + 181;
	    int solution3 = 10389 * 56 * 11 + 2246;
	    
	    System.out.println(equation1 + " = " + solution1);
	    System.out.println(equation2 + " = " + solution2);
	    System.out.println(equation3 + " = " + solution3);
	    
    }
}
