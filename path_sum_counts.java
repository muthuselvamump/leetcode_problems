public class path_sum_counts {
    public static void main(String []args){

    }
    public static int pathsum(TreeNode root,List<Integer> list,int sum){
        if(root==null){
            return 0;
        }
        list.add(root.val);
        int count=0;
        int i=list.size()-1;
        int s=0;

        while(!list.isEmpty()){
            s+=list.get(i--);
            if(s==sum){
                count++;
            }


        }
                                                                                                    
        count+=pathsum(root.left, list);
        count+=pathsum(root.right, list);
        list.remove(list.size()-1);
        return count;

    }
    
}
