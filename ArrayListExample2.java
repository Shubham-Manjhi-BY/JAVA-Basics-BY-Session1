import java.util.*;
public class ArrayListExample2{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Mango");//Adding object in arraylist    
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add(1,"Other");

        list.add(4,"Other");
        System.out.println(list.lastIndexOf("Other"));
        //Traversing list through Iterator  
        Iterator itr=list.iterator();//getting the Iterator  
        while(itr.hasNext()){//check if iterator has the elements  
            System.out.println(itr.next());//printing the element and move to next  
        }


        ArrayList<String> list2=new ArrayList<String>();//Creating arraylist
        list2 = (ArrayList)list.clone();

        Iterator itr3=list.iterator();//getting the Iterator
        while(itr3.hasNext()){//check if iterator has the elements
            System.out.println(itr3.next());//printing the element and move to next
        }


        String list3[] = new String[list.size()];
        list3 = list.toArray(list3);

        Iterator itr4=list2.iterator();//getting the Iterator
        while(itr4.hasNext()){//check if iterator has the elements
            System.out.println(itr4.next());//printing the element and move to next
        }


        list.clear();
        //Traversing list through Iterator
        Iterator itr2=list.iterator();//getting the Iterator
        while(itr2.hasNext()){//check if iterator has the elements
            System.out.println(itr2.next());//printing the element and move to next
        }

        System.out.println("Size of ArrayList: " + list2.size());
        list2.trimToSize();
        System.out.println("Size of ArrayList: " + list2.size());
        Iterator itr6=list2.iterator();//getting the Iterator
        while(itr6.hasNext()){//check if iterator has the elements
            System.out.println(itr6.next());//printing the element and move to next
        }



    }
}  