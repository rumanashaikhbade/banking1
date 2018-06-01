/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class testbanking1 {
      Bank b1;
    
    public testbanking1() {
        
        float amount = 1000;
        b1 =new Bank(amount);  
        
        //this.b1=new bank(amount);
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
           
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testdeposit() {
        assertEquals(1100,b1.deposit(100));
        assertEquals(1750,b1.deposit(650));
     }
      @Test
     public void testwithdraw() {
        assertEquals(900,b1.withdraw(100));
        assertEquals(250,b1.withdraw(650));
     }
     
     public void testwithdraw_and_display() {
        assertEquals(900,b1.withdraw(100));
        assertEquals(900,b1.display());
        assertEquals(250,b1.withdraw(650));
        assertEquals(250,b1.display());
     }
}
