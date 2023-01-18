package SinglyLinkedList;

import java.util.SortedMap;

public class LL {

    //Our linked list have these three variables
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    //To Add element in the first index
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;

    }

    //To add element in the last index
    public void insertLast(int value){

        //If tail is pointing to the null object means there is no element in the list so
        //call the insertFirst() method
        if(tail == null){
            insertFirst(value);
            //After calling the method it will do its work then the code will execute from next line so that's why we use return
            //keyword here
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //To add the element at the particular index
    //Remember that in these function i assume the starting index here is 0, It's your choice 
    //You can write these function also that will work on starting index=1 its your choice
    //and the size of linked list will be start counting from 1 just like arrays size 
    public void insert(int index, int value){

        if(index > size){
            System.out.println("Check the size");
            return;
        }

        if(index == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        Node before = head;

        for(int i=0; i<index; i++){

            if(i==index-1){
                before = temp; 
            }

            temp = temp.next;
        }

        before.next = node;
        node.next = temp;
        size++;

    }

    //Insert using Recursion it's public so user can access this
    public void insertRec(int index, int value){
        head = insertRec(index, value, head);
    }

    //It's private so we don't want to access this from user
    private Node insertRec(int index, int value, Node node){

        if(index == 0){
            Node temp = new Node(value);
            temp.next = node;
            size++;
            return temp;
        }

        node.next = insertRec(index-1, value, node.next);
        return node;
    }

    //To Delete the element at particular index
    public int delete(int index){

        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        //the toDelete will point out to the object that you insert the index
        Node toDelete = get(index);
        int value = toDelete.value;
        //The before will point out to the object of index-1
        Node before = get(index-1);
        //Inside the before object there is next variable inside that, so the next variable is pointing out to 
        //the object that we want to delete so we modified that
        //now the next variable will point out to the toDelete.next object
        before.next = toDelete.next;
        toDelete = null;
        size--;
        return value;
    }

    //This Method will delete the first element and returs the value
    public int deleteFirst(){

        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return value;
    }

    //This method will delete the last item of the list
    public int deleteLast(){

        int value = tail.value;
        Node secondLast = head;
        //This for loop will traverse the last second element
        //after that the last second element will be tail
        for(int i=0; i < size-2; i++){
            secondLast = secondLast.next;
        }
        tail = secondLast;
        //The second last elment will point out to the null because the last element is delted so there is no element present
        //Now this will remove by Garbage collector later on
        tail.next = null;
        size--;
        return value;

    }

    //It will point out to the object of the index you put on
    public Node get(int index){
        Node node = head;
        for(int i=0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    //To get a value at a particular index
    public int getValue(int index){

        if(index >= size){
            System.out.print("Index out of bound ");
            return index;
        }

        int value = get(index).value;
        return value;
    }

    //To get a node object with the help of value
    public Node find(int value){

        Node node = head;
        while(node != null){
            
            if(node.value == value){
                return node;
            }

            node = node.next;
        }

        return null;

    }

    public int getIndex(Node node){
        Node temp = head;
        int i = 0;
        while(temp != node){
            temp = temp.next;
            i++;
        }
        return i;
    }

    //To Disply our list
    public void display(){
        //A reference variable named temp is pointing out to the object that head is pointing out to
        //example like head is pointing out to the object which have value = 3 then temp will also point out to the same
        //object that head is pointing means temp.value = 3; temp is pointing out to the object that have value=3

        Node temp = head;

        //Loop jab tak chalana hai tab tak temp null nahi hojata, temp jaise hi null object ko point out karega 
        //loop stop ho jayega
        while(temp != null){

            System.out.print(temp.value + " --> ");
            //After printing the current object, you know temp is pointing out to the current head object 
            //so inside that object there is a next vairble that is pointing out to the next object of LinkedList
            //Then temp will point out to the next object with the help of temp.next
            //because temp is pointing out to an object that contains next reference varaible which is pointing out to object that is
            //next, so temp will point out to the next object
            temp = temp.next;

        }
        System.out.println("END");
    }

    //To print the size of out list
    public void size(){
        System.out.println("The size of your linked list is: " + size);
    }
    
    //Here the object will be created for each element 
    //means here our elments are stored in the object
    //and object is linked and its a singly linked list
    //like 3,4,5,6 the object that contain value 3 will be point to value=4 object vice versa
    //3->4->5->6 its linked only one sided 
    //This we will study in next Lecture 3 <-> 4 <-> 5 <-> 6

    //Basically our object Will be of Class Node and in that object there are instance variables 
    //value --> This will store the value like 3,4
    //Node next --> This is a object named "next" which is byDefault is pointing out to the null object 
    //the next reference variable will be pointing out to the next object that is linked with current object 
    //means 3-->4 here the object that contain value=3, have instance "next" reference variable which will point to the object
    //that contain value=4 
    //and the object that contain value=4 have instance "next" reference variable but this next will point out to the null object
    //because this is a last element in the list

    private class Node {

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //Question to remove duplicates from the list
    public void removeDuplicates(){
        Node node = head;

        //Traverse whole list

        while(node.next != null){
            if(node.next.value == node.value){
                node.next = node.next.next;
                size--;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //Question 3 --> To merge two sorted list great!!
    public static LL mergeSortedList(LL list1, LL list2){
        LL ans = new LL();
        Node node = list1.head;
        Node temp = list2.head;

        while(node != null && temp != null){

            if(node.value <= temp.value){
                ans.insertLast(node.value);
                node = node.next;
            }

            if(node == null){
                break;
            }

            if(temp.value <= node.value){
                ans.insertLast(temp.value);
                temp = temp.next;
            }

        }

        while(node != null){
            ans.insertLast(node.value);
        }

        while(temp != null){
            ans.insertLast(temp.value);
            temp = temp.next;
        }

        return ans;
    }

    //Question 4 --> To Detect wether the linked list contains a cycle or not
    public boolean hasCycle() {
        Node f = head;
        Node s = head;
        while(f != null && f.next !=null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                return true;
            }
        }
        return false;
    }

    //Question5 --> To Find the length of the Cycle
    //1->2->3->4->5->6->7->8->4
    //Here i cant create a cycle but you can see out 8 is pointing out to the 4 which is previous it creates a cycle
    //here the Length of the cycle is : 5
    //We will find the length using the Fast and Slow pointer method
    //Amazon and Microsoft
    public int lengthOfCycle(){
        Node f = head;
        Node s = head;
        while(f != null && f.next !=null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                int length = 0;
                s = s.next;
                while(f != s){

                    s = s.next;
                    length++;
                }
                return length;
            }
        }
        return 0;
    }

    //Question5 --> To find the starting node of cycle where the cycle is starting
    public Node detectCycleStart(){
        Node f = head;
        Node s = head;
        int length = lengthOfCycle();

        //If the length is = 0 means the cycle is not present
        if(length == 0){
            System.out.println("The cycle is not present");
            return null;
        }

        //Move s length of cycle times
        for(int i=1; i <= length; i++){
            s = s.next;
        }
        //Now move f and s forward one jump until they reach both reach at same node
        while(f != s){
            f = f.next;
            s = s.next;
        }
        //Now f and s is on the node which is starting node of the cycle
        return f;
    }

    //Question 6 --> Happy number
    //You have to return wether the number is happy or not 
    //n=19 --> 1^2 + 9^2 = 82 --> 8^2+2^2=68 --> 6^2 + 8^2 = 100 --> 1^2 + 0^2 + 0^2 = 1
    //If doing the sumation like this if it reaches to 1 then it is a happy number
    //if it not reaches to 1 it means it is not happy number
    //When you let's say take n=4 then you will do sum again and again and you will find that 
    //You reached at 4 again it means Cycle Linked List

    //Kunal Kushwaha Logic
    public int calculateSum(int n){
        int ans = 0;
        while(n > 0){
            int rem = n%10;
            ans = ans + rem*rem;
            n = n/10;
        }
        return ans;
    }

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = calculateSum(slow);
            fast = calculateSum(calculateSum(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }

        return false;
    }

    private int lengthOfLL(){
        Node temp = head;
        int counter = 1;
        while(temp != null){
            temp = temp.next;
            counter++;
        }

        return counter;
    }


    //Q7 --> Find middle node of linked list
    // public Node middleNode(){

    //     if(head == null){
    //         return null;
    //     }

    //     if(size == 1){
    //         return head;
    //     }

    //     Node temp = head;
    //     int length = lengthOfLL();
    //     for(int i=1; i <= length/2; i++){
    //         temp = temp.next;
    //     }
    //     return temp;
    // }

    //Another way to solve this problem (Middle Node)
    //The fast node is movind twice the speed of slow node 
    //When the fast node reaches at the end of LL (tail) then the second node will be pointing to the middle node 
    public Node middleNode(){
        if(head == null){
            return null;
        }

        if(size == 1){
            return head;
        }

        Node f = head;
        Node s = head;
        while(f != null && f.next != null){
            
            s = s.next;
            f = f.next.next;
            
        }
        return s;
    }

    public void headAndTail(){
        System.out.println(head.value);
        System.out.println(tail.value);
    }

    //Q8 --> Bubble sort
    //In this you know we sort the left part then the right part and then we merge



    public void sort(){
        Node node = head;
        Node max = head;

        for(int i=0; i < size; i++){

            if(i == size-1){
                return;
            }

            for(int j=0; j < size-i; j++){

                if(node.value >= max.value){
                    max = node;
                }
                if(j != size-i-1){
                    node = node.next;
                }

            }

            //Edge Cases
            if(max == head){
                Node temp = node.next;
                head = max.next;
                node.next = max;
                max.next = temp;
            } else{
                Node beforeMax = get(getIndex(max) - 1);
                beforeMax.next = max.next;
                max.next = node.next;
                node.next = max;
            }

            if(i == 0){
                tail = max;
            }
            //After traversing the Linked List 
            //Reset the node and max to head
            node = head;
            max = head;

        }
    }

    //Q9 To reverse linked list using recurssion (In Google, Apple)

    public void reverseList(){
        Node node = reverse(head, 0);
    }

    public Node reverse(Node node, int i){
        if(node == tail){
            head = node;
            return node;
        }

        Node afterNode = reverse(node.next, i+1);
        afterNode.next = node;
        node.next = null;
        if(i == 0){
            tail = node;
        }
        return node;
    }

    //Reversing the list using Iterative 
    public void reverseIterative(){
        Node prev = null;
        Node pres = head;
        Node after = head.next;
        tail = pres;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = after;
            if(after != null){
                after = after.next;
            }
        }
        head = prev;
    }

    //Q10 Linked List reverse from left to right

    public void reverseBetween(int left, int right){
        Node beforeLeft = head;
        Node afterRight = head;

        Node leftNode = find(left);
        Node rightNode = find(right);
        
        int indexLeft = getIndex(leftNode);
        int indexRight = getIndex(rightNode);

        if(leftNode != head){
            beforeLeft = get(indexLeft-1);
        }

        if(rightNode != tail){
            afterRight = get(indexRight+1);
        }
        
        Node node = reverseBetween(leftNode, rightNode);

        if(leftNode != head){
            beforeLeft.next = rightNode;
        }
        if(rightNode != tail){
            leftNode.next = afterRight;
        }

        if(leftNode == head){
            head = rightNode;
        }

        if(rightNode == tail){
            tail = leftNode;
            leftNode.next = null;
        }


    }

    private Node reverseBetween(Node left, Node right){

        if(left == right){
            return  left;
        }

        Node afterNode = reverseBetween(left.next, right);
        afterNode.next = left;

        return left;

    }

    //Q11 Is your list is a palindrome or not
    public boolean isPalindrome(){

        int arr[] = new int[size];
        Node node = head;
        boolean ans = false;

        for(int i=0; i < size; i++){
            arr[i] = node.value;
            node = node.next;
        }
        node = head;
        for(int i=size-1; i >= 0; i--){
            if(arr[i] == node.value){
                node = node.next;
                ans = true;
            } else{
                ans = false;
                return ans;
            }
        }
        return ans;
    }

    //Q12 Reorder Linked List
    public void reorder(){

        Node hf = head;
        Node hs = tail;

        Node mid = middleNode();
        mid = mid.next;

        reverseBetween(mid.value, tail.value);
 
        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf!=null){
            hf.next = null;
        }
    }

    // Q13 Reverse K nodes
    public void reverseK(int k){

        if(k == size){
            reverseIterative();
            return;
        }

        Node left = head;
        Node right = head;

        while(right != null){

            for(int i=1; i < k; i++){

                if(right == null){
                    return;
                }

                right = right.next;
            }
            if(right == null){
                return;
            }

            reverseBetween(left.value, right.value);
            left = left.next;
            right = left;
        }

    }

    // Q14 ReverseAlternate K nodes means K nodes reverse karo or fir agli k nodes chor do or fir uski agli vali reverse karo
    //means ek set of nodes ko reverse karo fir uske agli vali ko skip karo or fir next vali reverse karo
    public void reverseAlternateK(int k){

        if(k == size){
            reverseIterative();
            return;
        }

        Node left = head;
        Node right = head;
        int counter = 1;

        while(right != null){

            if(counter % 2 == 0){

                for(int i=1; i < k; i++){
                    right = right.next;
                    if(right == null){
                        return;
                    }
                }
                right = right.next;
                left = right;
                counter++;

            } else{

                for(int i=1; i < k; i++){
    
                    right = right.next;

                    if(right == null){
                        return;
                    }
    
                }
    
                reverseBetween(left.value, right.value);
                left = left.next;
                right = left;
                counter++;

            }

        }

    }

    // Q To Rotate the List by k times from the right
    // example - 1-2-3-4-5 --> k=1 ans= 5-1-2-3-4, k=2 ans - 4-5-1-2-3
    public void rotateK(int k){

       if(k <= 0 || head == null || head.next == null){
        return;
       }

       tail.next = head;

       int rotation = k % size;
       int skipNodes = size - rotation;

       Node newTail = head;

       for(int i=1; i < skipNodes;  i++){
        newTail = newTail.next;
       }

       Node newHead = newTail.next;
       head = newHead;

       newTail.next = null;

    }



}
