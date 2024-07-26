 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCase3AddTwoNumbersTest extends TestCase{
     /**
     * Create the test case
     *
     * @param testName name of the test case
     */

     public TestCase3AddTwoNumbersTest(String testName){

        super(testName);

     }
     public  static Test suite(){
        return new TestSuite(TestCase3AddTwoNumbersTest.class);
     }
    public void testAddTwoNumbers() {
        // Create first linked list: [9,9,9,9,9,9,9]
        int[] values1 =  {9,9,9,9,9,9,9};
        ListNode l1 = Main.arrayToLinkedList(values1);
        

        int[] values2 =  {9,9,9,9};
        
        // Create second linked list: [9,9,9,9]
        ListNode l2 = Main.arrayToLinkedList(values2);

        int[] expectedResultValues =  {8,9,9,9,0,0,0,1};
        ListNode expectedResult = Main.arrayToLinkedList(expectedResultValues);

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

