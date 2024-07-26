 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCase2SumLinkedList extends TestCase{
     /**
     * Create the test case
     *
     * @param testName name of the test case
     */

     public TestCase2SumLinkedList(String testName){

        super(testName);

     }
     public  static Test suite(){
        return new TestSuite(TestCase2SumLinkedList.class);
     }
    public void testAddTwoNumbers() {
        int[] values =  {2,4,3};
        ListNode list = Main.arrayToLinkedList(values);
        int sumValueExpected = 9;
        int sumValue = Main.sumLinkedListNodeValue(list);
        // Assert the result
        assertTrue(sumValueExpected==sumValue);

    }

}

