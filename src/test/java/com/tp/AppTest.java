package com.tp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest 
    
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testAddition() 
    {
        int result = App.addition(4, 3);
        assertTrue(result == 7);
    }
}
