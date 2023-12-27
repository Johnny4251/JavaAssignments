/*
Name:           John Pertell
Date:           12.12.2022
Description:    This class uses a Doubly Linked List to implement a Double 
                Ended Queue('Deque'). The Deque class works best when used with
                the Chp20PC01 javafx GUI application. This class provides methods
                that retrieve and manipulate the Node's data. The Node's values
                are represented using the String data type. The address to the 
                front and rear Nodes are stored in the front and rear fields.
 */
package chp20pc01;

public class Deque {
    
    private class Node {
        
        // Pointers to the previous and next Node
        Node next;
        Node prev;
        
        // Holds the String value of the Node
        String value;
        
        /**
         * This constructor creates a new Node.
         * @param value. Holds the String value of the Node.
         * @param next. Holds the address to the next Node.
         * @param prev. Holds the address to the previous Node.
         */
        public Node(String value, Node next, Node prev)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        
        /**
         * This constructor calls the constructor above, but initializes
         * all pointers to null.
         * @param value. Holds the String value of the Node.
         */
        public Node(String value)
        {
            this(value, null, null);
        }
        
        /**
         * This method returns the String value of the Node.
         * @return the value field.
         */
        public String toString()
        {
            return value;
        }
        
    }
    
    // Holds the address of the first and last Nodes in the Deque.
    Node front;
    Node rear;
    
    
    /**
     * This method will scan the Deque and return a counter of how many
     * Nodes are in the Deque.
     * @return size. Size is the amount of Nodes counted. 
     */
    public int size()
    {
        // Running total of the Nodes.
        int size = 0;
        
        // Used to keep track of the Nodes.
        Node ref = front;
        
        // Scanning the Deque and incrementing size whenever a Node exists.
        while(ref != null)
        {
            size++;
            ref = ref.next;
        }
        
        return size;
    }
    
    /**
     * This method will return true if the Deque has any Nodes.
     * @return true if the Deque has any Nodes.
     */
    public boolean empty()
    {
        return size() == 0;
    }
    
    /**
     * This method adds a Node to the front of the Deque. The Node's value
     * is that of the parameter passed in value. 
     * @param value. The value of the new Node coming in to the rear.
     */
    public void addFront(String value)
    {
        // Checking if the Deque contains any Nodes
        if(empty())
        {
            // If it does, create a new Node and assign it to front.
            front = new Node(value);
            
            // Because the Node is the only Node in the Deque, it must also
            // be the last Node in the Deque.            
            rear = front;
        }
        else
        {
            // Change the address of rear to the new rear Node.
            front.prev = new Node(value, front, null);
            
            // Make the new Node the last Node in the Deque.
            front = front.prev;
        }
    }
    
    
    /**
     * This method adds a Node to the rear of the Deque. The Node's value
     * is that of the parameter passed in value. 
     * @param value. The value of the new Node coming in to the rear.
     */
    public void addRear(String value)
    {
        // Checking if the Deque contains any Nodes
        if(empty())
        {
            // If it does, create a new Node and assign it to rear.
            rear = new Node(value);
            
            // Because the Node is the only Node in the Deque, it must also
            // be the last Node in the Deque. 
            front = rear;
        }
        else
        {
            // Change the address of rear to the new rear Node.
            rear.next = new Node(value, null, rear);
            
            // Make the new Node the last Node in the Deque.
            rear = rear.next;
        }
    }
    
    /**
     * This method removes the Node from the front of the Deque and returns
     * it's value.
     * @return value. The value of the Node at the front of the Deque.
     * @throws Exception if the Deque is empty. 
     */
    public String removeFront() throws Exception
    {
        // Because we can not remove a Node from an empty Deque
        if(empty()) { throw new Exception("Deque Underflow"); }
        
        // Assign value the value of front
        String value = front.value;
        
        // Checking if front is only Node in Deque
        if(front.next != null)
        {
            // Removing all references to the current front Node
            front = front.next;
            front.prev = null;
        }
        else { front = null; rear = null; }
        
        // Returning the value of front
        return value;
    }
    
    /**
     * This method removes the Node from the front of the Deque and returns
     * it's value.
     * @return value. The value of the Node at the front of the Deque.
     * @throws Exception if the Deque is empty. 
     */
    public String removeRear() throws Exception 
    {
        // Because we can not remove a Node from an empty Deque
        if(empty()) { throw new Exception("Deque Underflow"); }
        
        String value = rear.value;
        
        if(rear.prev != null)
        {
            // Removing all references to the current rear Node
            rear = rear.prev;
            rear.next = null;
        }
        else { rear = null; front = null; }
            
        // Returning the value of rear
        return value;
    }

    
    /**
     * This method reverses the Deque by switching the prev and next pointers.
     */
    public void reverse()
    {
        // Keeping a reference to the curr Node and a Node to reference too.
        Node curr = front;
        Node ref = null;
        // Traverse the Deque by using the curr Node.
        while(curr != null)
        {
            ref = curr.prev;
            curr.prev = curr.next;
            curr.next = ref;
            curr = curr.prev;
        }
        // Check for special cases before reassigning head
        if(ref != null)
            front = ref.prev;
    }
    
    /**
     * This method sorts the Deque in ascending order by using a bubble sort
     * to traverse the Deque. If the compared Node's values need to be swapped,
     * then they are swapped by value;
     */
    public void sortAsc()
    {
        // Used to keep reference of locations
        Node curr = front;
        Node nextNode = null;
        
        // Traversing the Deque by using curr
        while(curr != null)
        {
            // Use nextNode to get the value of the Node after curr
            nextNode = curr.next;
            while(nextNode != null)
            {
                // If the curr Node's value is greater than it's next value,
                // swap values.
                if(curr.value.compareTo(nextNode.value) > 0)
                {
                    String temp = nextNode.value;
                    nextNode.value = curr.value;
                    curr.value = temp;
                }
                // Iterate over to the next node
                nextNode = nextNode.next;
            }
            // Iterate the current Node after it has scanned the whole Deque
            curr = curr.next;
        }
    }
    
    /**
     * This method sorts the Deque in descending order by using a bubble sort
     * to traverse the Deque. If the compared Node's values need to be swapped,
     * then they are swapped by value;
     */
    public void sortDesc()
    {
        // Used to keep reference of locations
        Node curr = front;
        Node nextNode = null;
        
        // Traversing the Deque by using curr
        while(curr != null)
        {
            // Use nextNode to get the value of the Node after curr
            nextNode = curr.next;
            while(nextNode != null)
            {
                // If the curr Node's value is less than it's next value,
                // swap values.
                if(curr.value.compareTo(nextNode.value) < 0)
                {
                    String temp = nextNode.value;
                    nextNode.value = curr.value;
                    curr.value = temp;
                }
                // Iterate over to the next node
                nextNode = nextNode.next;
            }
            // Iterate the current Node after it has scanned the whole Deque
            curr = curr.next;
        }
    }
    
    /**
     * This method traverses the Deque looking for a String. If the target is 
     * found then the method will return back the index of the target. If the 
     * target is not found, this method will return back a -1.
     * @param target. Passed in as a value to look for.
     * @return location. The index of target. Will return a -1 if not found.
     */
    public int find(String target)
    {
        // Location will stay at -1 if not found
        int location = -1;
        
        // Used as a counter to keep track of the index
        int index = 0;
        
        // Used to iterate across Deque
        Node curr = front;
        while(curr != null)
        {
            // Checking to see if our current position's value is the target
            if(curr.value.equals(target)) { location = index; }
            index++;
            curr = curr.next;
        }
        
        return location;
    }
    
    /**
     * This method clears the Deque by setting the front and rear to null. 
     * Java's garbage collector will clear the Deque from memory.
     */
    public void clear()
    {
        front = null;
        rear = null;
    }
     
    /**
     * Traverses the Deque and returns it as a String separated by new
     * lines.
     * @return the Deque as a String separated by new lines.
     */
    public String toString()
    {
        // Using StringBuilder to create a String
        StringBuilder sBuilder = new StringBuilder();
        
        // Traversing the Deque and appending new lines after every Node
        Node ref = front;
        while(ref != null)
        {
            sBuilder.append(ref.value + "\n");
            ref = ref.next;
        }
        
        return sBuilder.toString();
    }   
}
