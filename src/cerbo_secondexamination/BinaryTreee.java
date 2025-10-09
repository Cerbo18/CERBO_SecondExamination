
package cerbo_secondexamination;

public class BinaryTreee{
    
    private Node TreeRoot;
    
    public BinaryTreee(){
        this.TreeRoot = null;                
    }
    
    class Node{
        String word;
        Node Left;
        Node Right;
        public Node(String word){
            this.word=word;
            this.Left = null;
            this.Right = null;
        }
    }   
    //To insert the passage
    public void insert(String word) {
        TreeRoot = insertRec(TreeRoot, word);
    }

    private Node insertRec(Node root, String word) {
        if (root == null) {
            return new Node(word);
        }
        //ignores the case as it compars
        int compare = word.compareToIgnoreCase(root.word);
        if(compare < 0){
            root.Left = insertRec(root.Left, word);
        }else if (compare > 0){
            root.Right = insertRec(root.Right, word);
        }
        //if equal, no insert, no duplicate
        return root;
    }

    //In-order traversal 
    public void inorderPrint(){
        System.out.println("\nIn Order Traveral: ");
        inorderRec(TreeRoot);
    }

    private void inorderRec(Node root){
        if(root != null){
            inorderRec(root.Left);
            System.out.println(root.word);
            inorderRec(root.Right);
        }
    }
    
    //PreOrder Traversal
    public void printPreOrder(){
        System.out.println("\nPre Order Traversal:");
        preOrder(TreeRoot);
    }

    private void preOrder(Node node){
        if(node != null) {
            System.out.println(node.word);
            preOrder(node.Left);
            preOrder(node.Right);
        }
    }
    
    
     //PostOrder Traversal
    public void printPostOrder(){
        System.out.println("\nPost Order Traversal:");
        postOrder(TreeRoot);
    }

    private void postOrder(Node node){
        if(node != null) {
            postOrder(node.Left);
            postOrder(node.Right);
            System.out.println(node.word);
        }
    }
    
}
