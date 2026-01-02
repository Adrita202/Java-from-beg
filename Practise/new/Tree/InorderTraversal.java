public class InorderTraversal {
    static void inorder(Node root){
        if(root==null)
            return;

        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
}
class PreorderTraversal{
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.right);
        

    }
}