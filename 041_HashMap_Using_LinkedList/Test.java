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
                    //rehash();
                }
            }
        }
    }
}