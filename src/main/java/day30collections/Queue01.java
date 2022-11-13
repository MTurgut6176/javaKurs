package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
        Ilk giren elemani ilk kullanmaniz(First In First Out ==> FIFO) gerektiginde Queue en iyi secimdir.
        Queue da elemanlar "insertion order" a gore dizilirler.
        Queue da peek(), poll(), element(), remove() gibi ilk elemani ilgilendiren bir cok method vardir.
        offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
     */
    public static void main(String[] args) {

        Queue<String> wareHouse=new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meet");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes]

        /*
        Inserts the specified element into this queue if it is possible to do so
        immediately without violating capacity restrictions. When using a capacity-restricted queue,
        this method is generally preferable to add, which can fail to insert an element only by throwing an
        exception.
        Params:
        e – the element to add
         Returns:
        true if the element was added to this queue, else false
       Throws:
       ClassCastException – if the class of the specified element prevents it from being added to this queue
       NullPointerException – if the specified element is null and this queue does not permit null elements
       IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */

        wareHouse.offer("potatoes");
        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes, potatoes]
    }
}
