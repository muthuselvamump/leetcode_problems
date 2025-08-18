import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class level_order_successor_of_a_node {
    public static void main(String[] args) {
        
    }
    public static int level_orde(TreeNode root,int sval){
        Queue<TreeNode> s=new LinkedList<>();
        if(root==null){
            return -1;
        }
        s.offer(root);
        while(!s.isEmpty()){
            TreeNode temp=s.poll();
            if(temp.left!=null){
                s.offer(temp.left);
            }
            if(temp.right!=null){
                s.offer(temp.right);

            }
            if(temp.val==sval){
                break;
            }
        }
        int answer=-1;
        if(!s.isEmpty()){
        TreeNode ans=s.poll();
        answer=ans.val;
    }
        return answer;

    }
    

}
