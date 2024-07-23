import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int x) { val = x; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 
}

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the first list
        System.out.print("Enter the size of the first list: ");
        int n1 = scanner.nextInt();
        
        // Read the elements of the first list
        System.out.println("Enter the elements of the first list:");
        ListNode l1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);
            if (l1 == null) {
                l1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }
        
        // Read the size of the second list
        System.out.print("Enter the size of the second list: ");
        int n2 = scanner.nextInt();
        
        // Read the elements of the second list
        System.out.println("Enter the elements of the second list:");
        ListNode l2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);
            if (l2 == null) {
                l2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }
        
        // Add the two numbers and get the result linked list
        ListNode result = addTwoNumbers(l1, l2);
        
        // Print the result linked list
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
        System.out.println();
        scanner.close();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
