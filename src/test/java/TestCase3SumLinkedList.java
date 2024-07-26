 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCase3SumLinkedList extends TestCase{
     /**
     * Create the test case
     *
     * @param testName name of the test case
     */

     public TestCase3SumLinkedList(String testName){

        super(testName);

     }
     public  static Test suite(){
        return new TestSuite(TestCase3SumLinkedList.class);
     }
    public void testAddTwoNumbers() {
        int[] values =  {4,2,5,6,7,2,5};
        ListNode list = Main.arrayToLinkedList(values);
        int sumValueExpected = 31;
        int sumValue = Main.sumLinkedListNodeValue(list);
        // Assert the result
        assertTrue(sumValueExpected==sumValue);

    }

}

