class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<heights.length;i++){
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                max=getmax(heights,s,max,i);
            }
            s.push(i);
        }
        int i=heights.length;
        while(!s.isEmpty()){
                max=getmax(heights,s,max,i);
            }
            return max;
    }
    public int getmax(int arr[],Stack<Integer> s,int max,int i){
        int area;
        int val=arr[s.pop()];
        if(s.isEmpty()){
            area=val*i;
            
        }else{
            area=val*(i-s.peek()-1);
            
        }
        return Math.max(max,area);
    }
    
}
public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        
    }
    
}
