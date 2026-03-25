/*

    * Entity Type Array :-
      In Java (especially in collections / HashMap internal working),
      an entity type array refers to the internal array that stores data entries (key–value pairs).

      An entity type array is an array whose elements are objects, not primitive values.
      Each element (entity) represents one complete data item.

    * Code :-

    class Entity {
        int key;
        String value;
    }

    Entity[] arr = new Entity[5];

*/

class HashMap_Using_Array
{
    private Entity[] entities;

    public HashMap_Using_Array()
    {
        entities = new Entity[100];
    }

    public void put(String key, String value)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key))
        {
            return entities[hash].value;
        }

        return null;
    }

    public void remove(String key)
    {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key))
        {
            entities[hash] = null;
        }
    }


    private class Entity{
        String key;
        String value;

        public Entity(String key, String value)
        {
            this.key = key;
            this.value = value;
        }
    }
}


public class Test 
{
    public static void main(String[] args) {
        HashMap_Using_Array map = new HashMap_Using_Array();

        map.put("Mango", "king of fruits");
        map.put("Apple", "keeps doctors away");
        map.put("Guava", "mom's fav");

        System.out.println(map.get("Mango"));

        map.remove("Apple");
        System.out.println(map.get("Apple"));

    }
}

/*
    1. Object created → constructor → array initialized

    2. put():
   key → hash → index → create Entity → store

    3. get():
   key → hash → index → check → return value

    4. remove():
   key → hash → index → check → delete
*/