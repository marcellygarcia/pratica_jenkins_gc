 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCase1AddTwoNumbersTest extends TestCase{
     /**
     * Create the test case
     *
     * @param testName name of the test case
     */

     public TestCase1AddTwoNumbersTest(String testName){

        super(testName);

     }
     public  static Test suite(){
        return new TestSuite(TestCase1AddTwoNumbersTest.class);
     }
    public void testAddTwoNumbers() {
        // Create first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Expected result: 7 -> 0 -> 8
        ListNode expectedResult = new ListNode(7);
        expectedResult.next = new ListNode(0);
        expectedResult.next.next = new ListNode(8);

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

