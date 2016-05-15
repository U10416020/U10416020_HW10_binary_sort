//U10416020
package binarytree;

public class BinaryTree<E extends Comparable<E>> {
    //Data fields
    protected TreeNode<E> root;
    protected int size=0;
    protected String result = "";
    
    //Default binary tree constructor
    public BinaryTree(){        
    }
    
    //Constructor to add numbers to tree nodes
    public BinaryTree(E[] objects){
        for(int i = 0; i<objects.length;i++){
            //Call insert method to add numbers to tree nodes
            insert(objects[i]);
        }
    }
    
    //Method to add numbers to tree nodes
    public void insert(E e){
        if(root==null){
            root = new TreeNode(e);
        }
        else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current!=null){
                if(e.compareTo(current.element)<0){
                    parent = current;
                    current = current.small;
                }
                else if(e.compareTo(current.element)>0){
                    parent = current;
                    current = current.big;
                }
            }
            if(e.compareTo(parent.element)<0){
                parent.small = new TreeNode(e);
            }
            else{
                parent.big = new TreeNode(e);
            }
        }
        size++;        
    }    
    
    //Set the result
    protected void inorder(TreeNode<E> root){
        if(root!=null){
            inorder(root.small);
            result += root.element+" ";            
            inorder(root.big);
        }
    }
    
    //Return the result
    public String toString(){
        inorder(root);        
        return result;
    }
    
    //Inner class named TreeNode
    public static class TreeNode<E extends Comparable<E>>{
        //Data fields
        protected E element;
        protected TreeNode<E> small;
        protected TreeNode<E> big;
        
        //Constructor
        public TreeNode(E e){
            element = e;
        }
    }
    
}
