 

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCase1SumLinkedList extends TestCase{
     /**
     * Create the test case
     *
     * @param testName name of the test case
     */

     public TestCase1SumLinkedList(String testName){

        super(testName);

     }
     public  static Test suite(){
        return new TestSuite(TestCase1SumLinkedList.class);
     }
    public void testAddTwoNumbers() {
        int[] values =  {9,9,9,9,9,9,9};
        ListNode list = Main.arrayToLinkedList(values);
        int sumValueExpected = 63;
        int sumValue = Main.sumLinkedListNodeValue(list);
        // Assert the result
        assertTrue(sumValueExpected==sumValue);

    }

}

