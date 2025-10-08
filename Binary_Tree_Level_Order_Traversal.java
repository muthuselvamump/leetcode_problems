class Solution101 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>(); 
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp!=null){
                l.add(temp.val);
                q.offer(temp.left);
                q.offer(temp.right);
                
                }
            }
            if(l.size()!=0){
            ans.add(l);}

        }

        return ans;
    }
}
public class Binary_Tree_Level_Order_Traversal {
    public static void main(String []args){

    }
    
}
