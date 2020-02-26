package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeExpandToIncludeTest 
{
    Range exampleRange;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception 
    {
        
    }
    
    @Before
    public void setUp() throws Exception 
    {
        exampleRange = new Range(2,7);
    }
    
    @Test
    public void testARangeExpansionFromPositiveToPositive() 
    {
        fail("FINISH THIS TEST LATER");
        /*
        try
        {
            Range shouldBeARangeFromTwoToTwenty = Range.expandToInclude(exampleRange, 20);
        }
        catch(Exception e)
        {
            
        }
        */
    }

    @After
    public void tearDown() throws Exception 
    {
        
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception 
    {
        
    }
}
