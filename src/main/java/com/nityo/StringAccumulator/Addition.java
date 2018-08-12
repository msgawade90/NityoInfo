package com.nityo.StringAccumulator;

import java.util.ArrayList;
import java.util.List;

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
	 public static int add(String str){
		 String[] numberArray = str.split(",");
		    int sum=0;
		 if(str.contains(","))
		     numberArray = str.split(",|\n|;");
		 if(str.contains(";"))
		 {
			 str=str.substring(3, str.length());
			 str=str.replace("\n", "");
		     numberArray = str.split(";");
		 }
		 if(str.length()==0)
		    {
	            sum=0;
		    }
		else{
		    List negativeNumbers = new ArrayList();

	            for (String number : numberArray) {
	                int numberInt = Integer.parseInt(number.trim());

	            	if (numberInt < 0) {
	            		negativeNumbers.add(numberInt);
	            	}
	                sum+=numberInt; 
	            }
	            if (negativeNumbers.size() > 0) {
	                throw new RuntimeException("Negatives numbers not allowed: " + negativeNumbers.toString());
	            }
	        }
			return sum;
	    }
}