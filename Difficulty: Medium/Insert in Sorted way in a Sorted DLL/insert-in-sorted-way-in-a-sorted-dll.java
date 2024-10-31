//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline character after t

        while (t-- > 0) {
            String input = sc.nextLine(); // Read the entire line for the array elements
            String[] values = input.split(" ");

            Node head = null, tail = null;
            for (String value : values) {
                int x = Integer.parseInt(value);
                if (head == null) {
                    head = new Node(x);
                    tail = head;
                } else {
                    tail.next = new Node(x);
                    tail.next.prev = tail;
                    tail = tail.next;
                }
            }

            int valueToInsert = sc.nextInt();
            if (sc.hasNextLine()) {
                sc.nextLine(); // Ignore the newline character after the value
            }

            Solution obj = new Solution();
            head = obj.sortedInsert(head, valueToInsert);
            printList(head);
        
System.out.println("~");
}

        sc.close();
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        
        Node newnode = new Node(x);
        
        if(head == null){//if list null
            return newnode;
        }
        
        
        Node temp = head;
        
        Node greater = null;
        
        while(temp != null){
            if(temp.data > x){
                break;
            }
            temp = temp.next;
        }
        
        
        greater = temp;
        
        if(greater == head){
            newnode.next = head;
            head.prev = newnode;
            return newnode;//here you have to be carefull
        }
        
        else if(greater == null){
        
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newnode;
        newnode.prev = last;
        // newnode.next = null;
        return head;
        }
       
        else{
        Node back = greater.prev;
        back.next = newnode;
        newnode.prev = back;
        newnode.next = greater;
        greater.prev = newnode;
        return head;
        }
      
    }
}