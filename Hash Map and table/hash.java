import java.util.*;
class hash{

    private Entity[] entities ;
    public hash (){
        entities = new Entity[100];
    }
    private class Entity {
        String key ;
        String value;

        public Entity(String key , String value){
        this.key = key;
        this.value = value;
        }
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key,value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null  && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null; //else if key not found retrun null
    }

    public String remove(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
             String oldValue = entities[hash].value;
            entities[hash] = null;
            return oldValue;
        }
        return null;

    }

    public static void main(String[] args) {

        hash map =  new hash();
        map.put("Mango","king of fruits");
        map.put("apple","a red fruit");

       System.out.println(map.get("apple"));
     
        map.remove("mango");
        
    }
}