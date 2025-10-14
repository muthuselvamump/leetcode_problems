import javax.swing.tree.TreeNode;

public class path_exit_binary_from_root_to_leaf_node {
    public static void main(String args[]){

    }
    public static boolean pathexit(TreeNode root,int []arr,int index){
        if(root==null){
          return false;
        }
        if (index >= arr.length) {
        return false;
    }
        if(root.val!=arr[index]){
            return false;
        }
        if(root.val==arr[index] &&  root.left==null && root.right ==null && index==arr.length-1){
            return true;
        }
        

        boolean b1=pathexit(root.left,arr,index+1);
        boolean b2=pathexit(root.right,arr,index+1);

        return b1 || b2;
    }
    
}
