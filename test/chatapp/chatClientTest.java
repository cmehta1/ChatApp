
package chatapp;

import java.awt.Event;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hs
 */
public class chatClientTest {
    
    public chatClientTest() {
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
     * Test of setup method, of class chatClient.
     */
    @Test
    public void testSetup() {
        System.out.println("setup");
        chatClient instance = null;
        instance.setup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of action method, of class chatClient.
     */
    @Test
    public void testAction() {
        System.out.println("action");
        Event e = null;
        Object o = null;
        chatClient instance = null;
        boolean expResult = false;
        boolean result = instance.action(e, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class chatClient.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        chatClient.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class chatClient.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        chatClient instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
