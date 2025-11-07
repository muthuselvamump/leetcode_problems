
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Base64.Decoder;

class Hnode implements Comparable<Hnode>{  
    Character value;
    int cost;

    Hnode left;
    Hnode right;
    Hnode(){

    }

    Hnode(Character ch,int cost){
        value=ch;
        this.cost=cost;
        left=null;
        right=null;
        
    }
    @Override
    public int compareTo(Hnode o1) {
        return this.cost-o1.cost;
    }

}
class huffman{
    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;

     huffman(String feeder){
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<feeder.length();i++){
            freq.put(feeder.charAt(i), freq.getOrDefault(feeder.charAt(i),0)+1);
        }
        PriorityQueue<Hnode> n=new PriorityQueue<>();
        for(Map.Entry<Character,Integer> entry:freq.entrySet()){
            Hnode node=new Hnode(entry.getKey(),entry.getValue());
            node.left=null;
            node.right=null;
            n.add(node);

        }
        while(n.size()!=1){
            Hnode first=n.remove();
            Hnode second=n.remove();
            Hnode new1=new Hnode('\0',first.cost+second.cost);
            new1.left=first;
            new1.right=second;

            n.add(new1);
        }
        Hnode ft=n.remove();
        encoder=new HashMap<>();
        decoder=new HashMap<>();

        feeding(ft,"");
    }
    public void feeding(Hnode root,String bset){

        if(root==null){
            return;
        }
        if(root.left==null &&root.right==null){
            encoder.put(root.value,bset);
            decoder.put(bset,root.value);

        }

        feeding(root.left, bset+"0");
        feeding(root.right, bset+"1");
    }

    public String encode(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            ans+=encoder.get(str.charAt(i));
        }
        return ans;

    }
    public String decode(String str){
        String ans="";
        String key="";
        for(int i=0;i<str.length();i++){
            key+=str.charAt(i);

            if(decoder.containsKey(key)){
                ans+=decoder.get(key);
                key="";
            }
        }
        return ans;
    }

}
public class hufman_greedy_algo {
    public static void main(String[] args) {
     
        
    }
}
