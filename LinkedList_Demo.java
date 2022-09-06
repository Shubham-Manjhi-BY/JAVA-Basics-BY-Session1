import javax.xml.soap.Node;
import java.util.LinkedList;

public class LinkedList_Demo {


    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        //PrintLL(list);
        System.out.println(" PrintLinked List : "+list);

        // Check Element Exist or Not
        System.out.println(list.contains(24));


        // Add Element to index.
        list.add(4,27);

        // Add Element to First Index.
        list.addFirst(28);

        // Add Element to Last.
        list.addLast(29);

        // Size of LinkedList [ Note : Integer Value ].
        System.out.println("Size of LinkedLIst : "+ list.size());
        System.out.println(" PrintLinked List : "+list);

        // Remove Particular Element.
        list.remove(5);

        // Find Index of Particular Element.
        System.out.println(list.indexOf(21)+" Index of 21 ");

        // Find the Index of Element - Last occurrence in case.
        System.out.println(list.lastIndexOf(22)+" Index of 22");

    }
}
