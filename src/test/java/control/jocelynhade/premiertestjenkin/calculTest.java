/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.jocelynhade.premiertestjenkin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author famil
 */
public class calculTest {
    
    public calculTest() {
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

    /**
     * Test of add method, of class calcul.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int val1 = 2;
        int val2 = 3;
        int expResult = 5;
        int result = calcul.add(val1, val2);
        assertEquals(expResult, result);

    }
    
}
