package day30collections;

import day21accessmodifiersinheritance.Student;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names); //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

      /*
      Retrieves, but does not remove, the head of the queue represented by this deque
      (in other words, the first element of this deque), or returns null if this deque is empty.

      Bu deque tarafından temsil edilen kuyruğun başını alır, ancak kaldırmaz
       (başka bir deyişle, bu deque'nin ilk öğesi) veya bu deque boşsa null değerini döndürür.
       */
        String firstEl=names.peek();
        System.out.println(firstEl); //Chris

        LinkedList<String> myList=new LinkedList<>();
        String first =myList.peek();
        System.out.println(first); //null


        /*
        Retrieves and removes the head of the queue represented by this deque (in other words,
        the first element of this deque), or returns null if this deque is empty.

        Bu deque tarafından temsil edilen kuyruğun başını alır ve kaldırır (başka bir deyişle,
         bu deque'nin ilk öğesi) veya bu deque boşsa null değerini döndürür.
         */

        String firstElement= names.poll();
        System.out.println(firstElement); //Chris

        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]


        /*
        Retrieves, but does not remove, the head of the queue represented by this deque
        (in other words, the first element of this deque). This method differs from peek only in that
        it throws an exception if this deque is empty.
         This method is equivalent to getFirst().

         Bu deque tarafından temsil edilen kuyruğun başını alır, ancak kaldırmaz
         (başka bir deyişle, bu deque'nin ilk öğesi). Bu yöntem, yalnızca bu deque boşsa bir istisna
         oluşturması bakımından peek'ten farklıdır.
          Bu yöntem getFirst() ile eşdeğerdir.
         */


       String f= names.element();

        System.out.println(f); //Alexndra
        System.out.println(names);  //[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
        Retrieves, but does not remove, the first element of this deque,
        or returns null if this deque is empty.
         */
        names.peekFirst();

        //Examole 1:"A" ile baslayan tum isimleri ******* ceviriniz

        LinkedList<String>  students=new LinkedList<>();

        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        for(String w:students){
            if(w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
        }
        System.out.println(students); //[Chris, *****, Mark, Tom, Jeremy, Hans]

        //Example 2:Listediki 4 harften cok olan isimleri siliniz

        //eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var ,o yuzden for loop kullaniyoruz.

        for(int i=0;i<students.size();i++){
            if(students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);// [Mark, Tom, Hans]

    }
}
