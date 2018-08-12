package com.nityo.StringAccumulator;

import org.junit.Assert;
import org.junit.Test;


/**
* The test class for Addition class.
*
* @author  Mangesh Gawade
* @version 1.0
* @since   2018-08-12 
*/
public class AdditionTest {

	
	@Test 
    public final void whenNoNumbersNoExceptionThrow() {
    Addition.add("");
    Assert.assertEquals(0, Addition.add(""));
	}
	@Test 
	public final void whenOneNumberNoExceptionThrow() {
	Addition.add("1");
    Assert.assertEquals(1, Addition.add("1"));
    }
    @Test
    public final void when2NumbersNoExceptionThrown() {
    	Addition.add("1,2");
        Assert.assertEquals(1+2, Addition.add("1,2"));
        Assert.assertTrue(true);
    }
    @Test
    public final void whenUnknownNumbersNoExceptionThrow() {
        Assert.assertEquals(1+2+3, Addition.add("1,2,3"));
    }
    @Test
    public final void whenNewLinesNoExceptionThrow() {
        Assert.assertEquals(1+2+3, Addition.add("1\n2,3"));
    }
}