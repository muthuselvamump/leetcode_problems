public class path_exit_binary_from_root_to_leaf_node {
    public static void main(String args[]){

    }
    public static boolean pathexit(TreeNode root){
        if(root==null){
          return false;
        }
        if(root.val==arr[index] &&  root.left==null && root.right ==null ){
            return true;
        }
        if(root.val!=arr[index]){
            return false;
        }

        pathexit(root.left,arr);
        pathexit(root.right,arr);
    }
    
}
