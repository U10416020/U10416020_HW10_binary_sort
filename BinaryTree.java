//U10416020
package binarytree;

public class BinaryTree {
    static class Node{
        int digit;
        Node smaller, bigger;
        
        public Node(int digit){
            this.digit = digit;
        }
    }
    Node head, first;
    int number[] = new int[20];
    int count = 0;
    BinaryTree(int newNumber[]){        
        System.arraycopy(newNumber, 0, number, 0, 20);
    }
    
    void addNode(){
        addFirst(number[0]);
        for(int i = 1;i<20;i++){
            addAll(number[i]);
        }
    }
    
    void addFirst(int number){
        Node newNode = new Node(number);
        newNode.smaller = null;
        newNode.bigger = null;
        first = newNode;
        head = newNode;
        count++;
    }
    
    void addAll(int number){
        if(number > first.digit){
            if(first.bigger == null){
                first.bigger = new Node(number);
            }
            else{
                Node current = first.bigger;
                compare(current);
            }
        }
        else{
            if(first.smaller == null){
                first.smaller = new Node(number);
            }
            else{
                Node current = first.smaller;
                compare(current);
            }
        }
        
    }
    
    void compare(Node current){
        
    }
    
    
}
