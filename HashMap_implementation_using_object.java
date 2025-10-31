class Hashmapobj{
    Entity [] entity=new Entity[100];
    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entity.length);
        entity[hash]=new Entity(key, value);
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entity.length);
        return entity[hash]!=null&&entity[hash].key.equals(key)?entity[hash].value:"null";

    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entity.length);
        if(entity[hash]!=null){
            entity[hash]=null;
        }

    }

}
class Entity{
    String key;
    String value;
    Entity(String key,String value){
        this.key=key;
        this.value=value;
    }
}
public class HashMap_implementation_using_object {
    public static void main(String[] args) {

       
        
    }
    
}
