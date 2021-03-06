package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataUtilitiesCreateNumberArrayTwoDTest 
{
    double[][] doubleTwoDArrayWithOnlyIntegers;  
    double[][] doubleTwoDArrayWithNonIntegerValues;  
    double[][] doubleTwoDArrayWithNegativeValues;  
    double[][] doubleTwoDArrayWithMixedValues; 
    double[][] invalidTwoDDoubleArray;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception 
    {
        
    }

    @Before
    public void setUp() throws Exception 
    {
        doubleTwoDArrayWithOnlyIntegers = new double[2][2];
        doubleTwoDArrayWithOnlyIntegers[0][0] = 1;
        doubleTwoDArrayWithOnlyIntegers[0][1] = 3;
        doubleTwoDArrayWithOnlyIntegers[1][0] = 2;
        doubleTwoDArrayWithOnlyIntegers[1][1] = 5;
        
        doubleTwoDArrayWithNonIntegerValues = new double[3][3];
        doubleTwoDArrayWithNonIntegerValues[0][0] = 1.1;
        doubleTwoDArrayWithNonIntegerValues[0][1] = 0.1;
        doubleTwoDArrayWithNonIntegerValues[0][2] = 3.14;
        doubleTwoDArrayWithNonIntegerValues[1][0] = 6.1;
        doubleTwoDArrayWithNonIntegerValues[1][1] = 7.7;
        doubleTwoDArrayWithNonIntegerValues[1][2] = 3.3;
        doubleTwoDArrayWithNonIntegerValues[2][0] = 0.7;
        doubleTwoDArrayWithNonIntegerValues[2][1] = 8.02;
        doubleTwoDArrayWithNonIntegerValues[2][2] = 11.09;
        
        doubleTwoDArrayWithNegativeValues = new double[2][2];
        doubleTwoDArrayWithNegativeValues[0][0] = -1;
        doubleTwoDArrayWithNegativeValues[0][1] = -2;
        doubleTwoDArrayWithNegativeValues[1][0] = -0.7;
        doubleTwoDArrayWithNegativeValues[1][1] = -8.9;
        
        doubleTwoDArrayWithMixedValues = new double[3][3];
        doubleTwoDArrayWithMixedValues[0][0] = 1;
        doubleTwoDArrayWithMixedValues[0][1] = 1.1;
        doubleTwoDArrayWithMixedValues[0][2] = 7;
        doubleTwoDArrayWithMixedValues[1][0] = 110;
        doubleTwoDArrayWithMixedValues[1][1] = 0.165;
        doubleTwoDArrayWithMixedValues[1][2] = -0.1;
        doubleTwoDArrayWithMixedValues[2][0] = 0.3;
        doubleTwoDArrayWithMixedValues[2][1] = -300;
        doubleTwoDArrayWithMixedValues[2][2] = 0;
        
        invalidTwoDDoubleArray = null;
    }
    
    @Test
    public void testWithIntegersOnly() 
    {
        try
        {
            Number[][] numberArray = DataUtilities.createNumberArray2D(doubleTwoDArrayWithOnlyIntegers);
            if(doubleTwoDArrayWithOnlyIntegers.length != numberArray.length)
            {
                fail("The arrays were not of matching size...");
            }
            boolean areArraysMatching = true;
            for(int i = 0; i < doubleTwoDArrayWithOnlyIntegers.length; i++)
            {
                if(doubleTwoDArrayWithOnlyIntegers[i].length != numberArray[i].length)
                {
                    fail("The arrays were not of matching size...");
                }
                for(int j = 0; j < doubleTwoDArrayWithOnlyIntegers[i].length; j++)
                {
                    if(doubleTwoDArrayWithOnlyIntegers[i][j] != numberArray[i][j].doubleValue())
                    {
                        areArraysMatching = false;
                    }
                }
            }
            assertTrue("The array with integers only produced by createNumberArray2D did not match the values of the original", areArraysMatching);
        }
        catch(Exception e)
        {
            fail("The test for creating a number array of only integers produced an exception...");
        }
    }
    
    @Test
    public void testWithNonIntegersOnly() 
    {
        try
        {
            Number[][] numberArray = DataUtilities.createNumberArray2D(doubleTwoDArrayWithNonIntegerValues);
            if(doubleTwoDArrayWithNonIntegerValues.length != numberArray.length)
            {
                fail("The arrays were not of matching size...");
            }
            boolean areArraysMatching = true;
            for(int i = 0; i < doubleTwoDArrayWithNonIntegerValues.length; i++)
            {
                if(doubleTwoDArrayWithNonIntegerValues[i].length != numberArray[i].length)
                {
                    fail("The arrays were not of matching size...");
                }
                for(int j = 0; j < doubleTwoDArrayWithNonIntegerValues[i].length; j++)
                {
                    if(doubleTwoDArrayWithNonIntegerValues[i][j] != numberArray[i][j].doubleValue())
                    {
                        areArraysMatching = false;
                    }
                }
            }
            assertTrue("The array with non-integers only produced by createNumberArray2D did not match the values of the original", areArraysMatching);
        }
        catch(Exception e)
        {
            fail("The test for creating a number array of only non-integers produced an exception...");
        }
    }
    
    @Test
    public void testWithNegativeValuesOnly() 
    {
        try
        {
            Number[][] numberArray = DataUtilities.createNumberArray2D(doubleTwoDArrayWithNegativeValues);
            if(doubleTwoDArrayWithNegativeValues.length != numberArray.length)
            {
                fail("The arrays were not of matching size...");
            }
            boolean areArraysMatching = true;
            for(int i = 0; i < doubleTwoDArrayWithNegativeValues.length; i++)
            {
                if(doubleTwoDArrayWithNegativeValues[i].length != numberArray[i].length)
                {
                    fail("The arrays were not of matching size...");
                }
                for(int j = 0; j < doubleTwoDArrayWithNegativeValues[i].length; j++)
                {
                    if(doubleTwoDArrayWithNegativeValues[i][j] != numberArray[i][j].doubleValue())
                    {
                        areArraysMatching = false;
                    }
                }
            }
            assertTrue("The array with negative values only produced by createNumberArray2D did not match the values of the original", areArraysMatching);
        }
        catch(Exception e)
        {
            fail("The test for creating a number array of only negative values produced an exception...");
        }
    }
    
    @Test
    public void testWithIntegersAndNonIntegersAndNegativeValues() 
    {
        try
        {
            Number[][] numberArray = DataUtilities.createNumberArray2D(doubleTwoDArrayWithMixedValues);
            if(doubleTwoDArrayWithMixedValues.length != numberArray.length)
            {
                fail("The arrays were not of matching size...");
            }
            boolean areArraysMatching = true;
            for(int i = 0; i < doubleTwoDArrayWithMixedValues.length; i++)
            {
                if(doubleTwoDArrayWithMixedValues[i].length != numberArray[i].length)
                {
                    fail("The arrays were not of matching size...");
                }
                for(int j = 0; j < doubleTwoDArrayWithMixedValues[i].length; j++)
                {
                    if(doubleTwoDArrayWithMixedValues[i][j] != numberArray[i][j].doubleValue())
                    {
                        areArraysMatching = false;
                    }
                }
            }
            assertTrue("The array with mixed values produced by createNumberArray2D did not match the values of the original", areArraysMatching);
        }
        catch(Exception e)
        {
            fail("The test for creating a number array of mixed values produced an exception...");
        }
    }
    
    @Test
    public void testForANullArray() 
    {
        try
        {
            Number[][] numberArray = DataUtilities.createNumberArray2D(invalidTwoDDoubleArray);
        }
        catch (InvalidParameterException ipe)
        {
            //This is here so that the test automatically passes if it threw the correct exception!
            assertTrue("This message should not be printed", true);
        }
        catch (Exception e)
        {
            fail("The null array produced an exception that was not an invalid parameter exception...");
        }
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
