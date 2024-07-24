package src;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        int tamArgs = args.length;
        ListNode l2 = null, tail2 = null;
        ListNode l1 = null, tail1 = null;
                
        if ((tamArgs > 0) && (args[0].equals("-V"))){
            int tamL1 = Integer.parseInt(args[1]);
            int indexL1 = 2, indexL2 = tamL1+3;
            int tamL2 = Integer.parseInt(args[1+tamL1+1]);
            for (int i = 0; i < tamL1; i++){
                int value = Integer.parseInt(args[indexL1+i]);
                ListNode newNode = new ListNode(value);
                if (l1 == null) {
                    l1 = newNode;
                    tail1 = newNode;
                } else {
                    tail1.next = newNode;
                    tail1 = newNode;
                } 
            }
            printLinkedList(l1);
            for (int i = 0; i < tamL2; i++) {
                int value = Integer.parseInt(args[indexL2+i]);
                ListNode newNode = new ListNode(value);
                if (l2 == null) {
                    l2 = newNode;
                    tail2 = newNode;
                } else {
                    tail2.next = newNode;
                    tail2 = newNode;
                }
            }
            printLinkedList(l2);
        } else {
            // Read the size of the first list
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the first list: ");
            int n1 = scanner.nextInt();
            
            // Read the elements of the first list
            System.out.println("Enter the elements of the first list:");
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
            printLinkedList(l1);
            System.out.print("Enter the size of the second list: ");
            int n2 = scanner.nextInt();
            
            // Read the elements of the second list
            System.out.println("Enter the elements of the second list:");
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
            printLinkedList(l2);
            scanner.close();
        }
        
        ListNode result = addTwoNumbers(l1, l2);
        printLinkedList(result);
        
        System.out.print("Soma lista1: ");
        System.out.print(sumLinkedListNodeValue(l1));
        System.out.println();
        System.out.print("Soma lista2: ");
        System.out.print(sumLinkedListNodeValue(l2));
        System.out.println();
        
        
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

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static Integer sumLinkedListNodeValue(ListNode head){
        Integer sum = 0;
        while (head != null){
            sum+= head.val;
            head=head.next;
        }
        return sum;
    }
}
