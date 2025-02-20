class Solution13 {
    public int romanToInt(String s) {
        int total=0;
        int arr[]={1,5,10,50,100,500,1000};
        int sl=s.length();
        int prev=0;
        int temp=0;
        int total1=0;
        char st[]={'I','V','X','L','C','D','M'};  
        for(int i=0;i<s.length();i++){
            for(int j=0;j<st.length;j++){                         
                if(s.charAt(i)==st[j]){   
                    if(prev<arr[j]){
                        prev=prev+prev;
                        temp=arr[j]-prev;
                        total+=temp;
                        System.out.print(temp+" ");
                    }
                    else{
                    System.out.println("sec"+arr[j]);
                    total+=arr[j];
                    }
                    prev=arr[j];
                    //System.out.print(arr[j]+ " ");
                }
            }
        }
        return total;

    }
}
public class RomantoInteger {
    public static void main(String[] args) {
        
    }
    
}
