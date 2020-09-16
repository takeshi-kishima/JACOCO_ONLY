package com.gmail.fukuoka.yahoo;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        if (false) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        App test = new App();
        Method method;
		try {
            method = App.class.getDeclaredMethod("main", String[].class);
            method.invoke(test, new Object[] { new String[] { "xxx" } });
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

            e.printStackTrace();
            assertTrue( false );
		}
        
        assertTrue( true );
    }
}
