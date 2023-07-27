package arrays;

public class MyMap {
    //implement map without using Map
    //implement put, get, remove, containsKey, containsValue, size, isEmpty, clear, keySet, values, entrySet

    public static void main (String[] args) {
        MyMap map = new MyMap();
        map.put("1", 1);
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("1", "fours");
        System.out.println(map.get("1"));
    }

    Node[] nodes = new Node[1000];
    //put with commennts
    public void put(String key, Object value){
        //get the index
        int index = key.hashCode() % nodes.length;
        //create a new node
        Node node = new Node(key, value);
        //if the index is empty
        if(nodes[index] == null){
            //add the node
            nodes[index] = node;
        } else {
            //if the index is not empty
            //get the node at the index
            Node current = nodes[index];
            //loop through the nodes
            while(current != null){
                //if the key is equal to the current key
                if(current.key.equals(key)){
                    //update the value
                    current.value = value;
                    //return
                    return;
                }
                //if the key is not equal to the current key
                //if the next node is null
                if(current.next == null){
                    //add the node
                    current.next = node;
                    //return
                    return;
                }
                //if the next node is not null
                //update the current node
                current = current.next;
            }
        }
    }

    //get
    public Object get(Object key){
        //add comments
        //get the index
        int index = key.hashCode() % nodes.length;
        //get the node at the index
        Node current = nodes[index];
        //loop through the nodes
        while(current != null){
            //if the key is equal to the current key
            if(current.key.equals(key)){
                //return the value
                return current.value;
            }
            //if the key is not equal to the current key
            //update the current node
            current = current.next;
        }
        //return null
        return null;

    }

}

class Node {
    String key;
    Object value;
    Node next;

    public Node(String key, Object value){
        this.key = key;
        this.value = value;
    }
}
