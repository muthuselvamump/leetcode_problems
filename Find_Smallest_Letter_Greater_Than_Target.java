class Solution_BinarysearchNGL {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(letters[mid]<=target){
                start=mid+1;
                
            }
            else{
                end=mid-1;
                
            }
        }
        if(start==letters.length){
            return letters[0];
        }
        return letters[start];
        
    }
}
public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        
    }
    
}
