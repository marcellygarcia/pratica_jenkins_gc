 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCase2AddTwoNumbersTest extends TestCase{
     /**
     * Create the test case
     *
     * @param testName name of the test case
     */

     public TestCase2AddTwoNumbersTest(String testName){

        super(testName);

     }
     public  static Test suite(){
        return new TestSuite(TestCase2AddTwoNumbersTest.class);
     }
    public void testAddTwoNumbers() {
        // Create first linked list: 0
        ListNode l1 = new ListNode(0);
        // Create second linked list: 0
        ListNode l2 = new ListNode(0);

        // Expected result: 0
        ListNode expectedResult = new ListNode(0);
        // Call addTwoNumbers
        ListNode result = Main.addTwoNumbers(l1, l2);
        // Assert the result
        assertTrue(areEqual(expectedResult, result));

        
    }

    boolean areEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}

