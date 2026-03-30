import java.util.ArrayList;
import java.util.LinkedList;

public class Test
{
    static class HashMap<K, V> //generics
    {
        private class Node{ // this node represents each entity in a LL
            K key;
            V value;

            public Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no of nodes
        private int m; // size of array (buckets)
        private LinkedList<Node> buckets[]; // m = buckets.length
        // buckets array whose type is LL of nodes

        /*
           this line is used bcz sometimes complier throughs warning if the type
           of ll is not specified
        */
        @SuppressWarnings("unchecked") 
        public HashMap()
        {
            this.m = 4;
            this.buckets = new LinkedList[4]; // lly int[] arr = new int[4]
            for (int i = 0; i < 4; i++)
            {
                this.buckets[i] = new LinkedList<>(); // creating empty ll
            }
        }

        private int hashFunction(K key)
        {
            int bucket_index = key.hashCode();
            return Math.abs(bucket_index) % m;
        }

        private int searchInLL(K key, int bucket_index)
        {
            LinkedList<Node> ll = buckets[bucket_index];

            for (int i = 0; i < ll.size(); i++)
            {
                if(ll.get(i).key == key)
                {
                    return i; // this will be the data_index
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash()
        {
            LinkedList<Node> oldBucket[] = buckets;
            /*
                oldBucket is NOT a new array; it is just a reference variable
                that points to the same array as buckets (no data copy happens).
            */
            buckets = new LinkedList[m * 2];

            for (int i = 0; i < m * 2; i++)
            {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++)
            {
                LinkedList<Node> ll = oldBucket[i];

                /*
                    ll is a reference variable that points to the existing 
                    LinkedList stored at oldBucket[i].
                */

                for (int j = 0; j < ll.size(); j++)
                {
                    Node node = ll.get(i);
                    /*
                        node is a ref variable that points to the existing Node
                        object returned by ll.get(j); no new Node is created here.
                    */
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value)
        {
            int bucket_index = hashFunction(key);
            int data_index = searchInLL(key, bucket_index);

            if (data_index == -1) // key doesn't exist
            {
                buckets[bucket_index].add(new Node(key, value));
                n++;
            }

            else // if exist
            {
                Node node = buckets[bucket_index].get(data_index);
                node.value = value;
            }

            double lf = (double)n/m;
            {
                if(lf > 2.0)
                {
                    rehash();
                }
            }
        }

        public V get(K key)
        {
            int bucket_index = hashFunction(key);
            int data_index = searchInLL(key, bucket_index);

            if (data_index == -1)
            {
                return null;
            }

            else{
                Node node = buckets[bucket_index].get(data_index);
                return node.value;
            }
        }

        public boolean containsKey(K key)
        {
            int bucket_index = hashFunction(key);
            int data_index = searchInLL(key, bucket_index);

            if (data_index == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        public V remove(K key)
        {
            int bucket_index = hashFunction(key);
            int data_index = searchInLL(key, bucket_index);

            if (data_index == -1)
            {
                return null;
            }

            else
            {
                Node node = buckets[bucket_index].remove(data_index);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty()
        {
            return n == 0;
        }

        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++)// bucket_index
            {
                LinkedList<Node> ll = buckets[i];

                for (int j = 0; j < ll.size(); j++)
                {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("India", 88);
        map.put("Nepal", 42);
        map.put("Russia", 64);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++)
        {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("Russia");
        System.out.println(map.get("Russia"));
    }
}