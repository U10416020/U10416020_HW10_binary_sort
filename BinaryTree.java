//U10416020
package binarytree;

public class BinaryTree<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size=0;
    
    public BinaryTree(){        
    }
    
    public BinaryTree(E[] objects){
        for(int i = 0; i<objects.length;i++){
            insert(objects[i]);
        }
    }
    
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
    
    public void inorder(){
        inorder(root);
    }
    
    protected void inorder(TreeNode<E> root){
        if(root!=null){
            inorder(root.small);
            System.out.print(root.element+" ");
            inorder(root.big);
        }
    }    
        
    public static class TreeNode<E extends Comparable<E>>{
        protected E element;
        protected TreeNode<E> small;
        protected TreeNode<E> big;
        
        public TreeNode(E e){
            element = e;
        }
    }
    
}
