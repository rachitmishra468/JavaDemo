package IBMMergeSortedArrays;


class Node {
    int data ;
    Node left , right;

   public Node(int v){
        data = v;
        left = right =null;
    }
}
public class BinaryTree {

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left= new Node(10);
        root.right = new Node(12);
        root.left.left = new Node(22);
        root.right.right = new Node(23);

        System.out.println("10 is present "+searchKey(11 , root));
    }

    public static boolean searchKey(int key , Node node){
        if (node == null){
            return false;
        }
        if(node.data ==key){
            return true;
        }

        return  searchKey(key , node.left) || searchKey(key , node.right);

    }

}
