package com.nityo.StringAccumulator;

/**
* The add program performs addition of numbers of string format.
*
* @author  Mangesh Gawade
* @version 1.0
* @since   2018-08-12 
*/
public class Addition {


	
	 /**
	   * This method is used to addition of numbers of string format
	   * @param str This is the string parameter for numbers
	   * @return int This returns sum of numbers.
	   */
	 public static void add(String str){
		    String[] numberArray = str.split(",");
		    if(str.length()==0)
		    {
	           int number=0;
		    }
		    else if (numberArray.length > 2) {
	            throw new RuntimeException("2 numbers allowed");
	        } else {
	            for (String number : numberArray) {
	                Integer.parseInt(number); 
	            }
	        }
	    }
}