import java.util.ArrayList;
import java.util.List;

public class path_sum_counts {
    public static void main(String []args){

    }
    public static int pathsum(TreeNode root,List<Integer> list,int sum){
        if(root==null){
            return 0;
        }
        list.add(root.val);
        int count=0;
        int s=0;

        for(int i=list.size()-1;i>=0;i--){
            s+=list.get(i);
            if(s==sum){
                count++;
            }
        }
                                                                                                    
        count+=pathsum(root.left, list);
        count+=pathsum(root.right, list);
        list.remove(list.size()-1);
        return count;

    }
     public static int addingpathsum(TreeNode root,List<Integer> list,int sum,List<List<Integer>> totallist){
        if(root==null){
            return 0;
        }
        list.add(root.val);
        int count=0;
        int s=0;

        for(int i=list.size()-1;i>=0;i--){
            s+=list.get(i);
            if(s==sum){
                List<Integer> l=new ArrayList<>(list.subList(i,list.size()));
                totallist.add(l);

                count++;
            }
        }
                                                                                                    
        count+=addingpathsum(root.left, list,totallist);
        count+=addingpathsum(root.right, list,totallist);
        list.remove(list.size()-1);
        return count;

    }
    
}
